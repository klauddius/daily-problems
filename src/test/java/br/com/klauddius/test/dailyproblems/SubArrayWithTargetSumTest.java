package br.com.klauddius.test.dailyproblems;

import br.com.klauddius.dailyproblems.SubArrayWithTargetSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SubArrayWithTargetSumTest {

    private final SubArrayWithTargetSum sawts = new SubArrayWithTargetSum();

    @Test
    public void testFoundKInTheMiddleOfArray() throws Exception {
        int[] orderedArray = new int[]{1, 3, 2, 5, 7, 2};
        int k = 14;

        Integer[] expecteds = {2, 5, 7};
        List<Integer> result = sawts.findContinuousK(orderedArray, k);
        Integer[] actuals = result.toArray(new Integer[0]);

        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFoundKInTheStartOfAnArray() throws Exception {
        int[] unorderedArray = new int[]{1, 3, 2, 5, 7, 2};
        int k = 6;

        Integer[] expecteds = {1, 3, 2};
        List<Integer> result = sawts.findContinuousK(unorderedArray, k);
        Integer[] actuals = result.toArray(new Integer[0]);

        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFoundKInTheEndOfAnArray() throws Exception {
        int[] unorderedArray = new int[]{1, 3, 2, 5, 7, 9, 22};
        int k = 38;

        Integer[] expecteds = {7, 9, 22};
        List<Integer> result = sawts.findContinuousK(unorderedArray, k);
        Integer[] actuals = result.toArray(new Integer[0]);

        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFoundKInAnArrayWithSubarrayOfSizeOne() throws Exception {
        int[] unorderedArray = new int[]{1, 3, 2, 5, 7, 2};
        int k = 2;

        Integer[] expecteds = {2};
        List<Integer> result = sawts.findContinuousK(unorderedArray, k);
        Integer[] actuals = result.toArray(new Integer[0]);

        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test(expected = Exception.class)
    public void testKNotFoundInArray() throws Exception {
        int[] array = new int[]{1, 2, 3};
        int k = 12;

        sawts.findContinuousK(array, k);
    }

}
