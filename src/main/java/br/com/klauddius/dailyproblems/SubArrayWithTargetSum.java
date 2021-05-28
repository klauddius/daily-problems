package br.com.klauddius.dailyproblems;

import java.util.ArrayList;

public class SubArrayWithTargetSum {

    /**
     * Hi, here's your problem today. This problem was recently asked by Amazon:
     * <p>
     * You are given an array of integers, and an integer K. Return the subarray which sums to K.
     * You can assume that a solution will always exist.
     * <p>
     * def find_continuous_k(list, k):
     * # Fill this in.
     * <p>
     * print find_continuous_k([1, 3, 2, 5, 7, 2], 14)
     * # [2, 5, 7]
     * <p>
     * Can you do this in linear time?
     *
     * @param array containing input data
     * @param k     representing the target sum
     * @return subarray with all items which sums to k
     */
    public ArrayList<Integer> findContinuousK(int[] array, int k) throws Exception {
        ArrayList<Integer> result = new ArrayList<>();
        int sum;
        boolean subarrayFound = false;
        for (int i = 0; i < array.length; i++) {
            result.clear();
            sum = array[i];
            result.add(array[i]);
            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                result.add(array[j]);
                if (sum >= k) {
                    break;
                }
            }
            if (sum == k) {
                subarrayFound = true;
                break;
            }
        }
        if (!subarrayFound) {
            throw new Exception("Subarray Not Found");
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        SubArrayWithTargetSum s = new SubArrayWithTargetSum();

        int[] testArray = {1, 3, 2, 5, 7, 2};
        s.findContinuousK(testArray, 14);
    }

}
