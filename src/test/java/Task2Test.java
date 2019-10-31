import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void findSubarrayWithGivenSum_null() {
        assertFalse(Task2.findSubarrayWithGivenSum(null, 0));
    }

    @Test
    public void findSubarrayWithGivenSum_emptyArray() {
        assertFalse(Task2.findSubarrayWithGivenSum(new int[0], 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findSubarrayWithGivenSum_negativeTargetSum() {
        assertFalse(Task2.findSubarrayWithGivenSum(new int[] {1}, -2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findSubarrayWithGivenSum_negativeElementInArray() {
        assertFalse(Task2.findSubarrayWithGivenSum(new int[] {1, 2, -5, 8}, 4));
    }

    @Test
    public void findSubarrayWithGivenSum_hasSum_first() {
        assertTrue(Task2.findSubarrayWithGivenSum(new int[] {1, 2, 3, 4}, 1));
    }

    @Test
    public void findSubarrayWithGivenSum_hasSum() {
        assertTrue(Task2.findSubarrayWithGivenSum(new int[] {1, 2, 3, 4}, 7));
    }


    @Test
    public void findSubarrayWithGivenSum_noSum() {
        assertFalse(Task2.findSubarrayWithGivenSum(new int[] {1, 2, 3, 4}, 8));
    }

    @Test
    public void findSubarrayWithGivenSum_sumNotInSubarray() {
        assertFalse(Task2.findSubarrayWithGivenSum(new int[] {1, 5, 3, 8}, 13));
    }
}