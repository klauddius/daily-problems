package br.com.klauddius.test.dailyproblems;

import br.com.klauddius.dailyproblems.SubArrayWithTargetSum;
import org.junit.Assert;
import org.junit.Test;

public class SubArrayWithTargetSumTest {

    SubArrayWithTargetSum sawts = new SubArrayWithTargetSum();

    @Test
    public void testKFoundInOrderedArray() {
        int[] orderedArray = new int[]{1, 2, 3, 4, 5};
        int k = 6;

        int[] expecteds = {1, 2, 3};
        int[] actuals = sawts.findContinuousK(orderedArray, k);

        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testKFoundInAnUnorderedArray() {
        int[] unorderedArray = new int[]{1, 4, 5, 2, 3};
        int k = 6;

        int[] expecteds = {4, 2};
        int[] actuals = sawts.findContinuousK(unorderedArray, k);

        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testKNotFoundInArray() {
        int[] array = new int[]{1, 2, 3};
        int k = 12;

        int[] expecteds = new int[0];
        int[] actuals = sawts.findContinuousK(array, k);

        Assert.assertArrayEquals(expecteds, actuals);
    }

}
