class Task2 {

    static boolean findSubarrayWithGivenSum(int[] array, int targetSum) {
        if (array == null || array.length == 0) {
            return false;
        }

        if (targetSum < 0) {
            throw new IllegalArgumentException("Negative target sum is not allowed");
        }

        if (targetSum == 0) {
            return true;
        }

        int currentSum = 0;
        int startingIdx = 0;

        for (int number : array) {
            if (number < 0) {
                throw new IllegalArgumentException("Negative element in array is not allowed");
            }

            currentSum += number;

            while (currentSum > targetSum) {
                currentSum -= array[startingIdx];
                startingIdx += 1;
            }

            if (currentSum == targetSum) {
                return true;
            }
        }

        return false;
    }
}
