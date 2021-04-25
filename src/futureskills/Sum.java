package futureskills;

/**
 * question this method takes takes two input of int array and then it will find uncommon
 * values from arrays and then print digit sum of the sum of values. repeat digit sum until
 * sum will become single digit some.
 */
public class Sum {
    public static int getSum(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        int arr1Sum = 0;
        int arr2Sum = 0;
        int sum = 0;

        //loop to iterate both loops as well as store sum of array1.
        for (int i = 0; i < arr1.length; i++) {
            arr1Sum = arr1Sum + arr1[i];

            //loop to check the condition and store the sum of common elements.
            for (int j = 0; j < arr2.length; j++) {
                arr2Sum = arr2Sum + arr2[i];
                if (arr1[i] != arr2[j]) {
                    continue;
                }
                sum1 = sum1 + arr1[i];
                sum2 = sum2 + arr2[j];
            }
        }
        // (total sum - common elements) + (total elements - common elements of array2)
        sum = (arr1Sum - sum1) + ((arr2Sum/2) - sum2);

        return singleDigitSum(sum);
    }

    // method to get digit sum recursively until single digit left.
    private static int singleDigitSum(int data) {
        int sum = 0;
        if (data / 10 == 0)
            return data;
        else {
            while (data != 0) {
                sum = sum + data % 10;
                data = data / 10;
            }
            if (sum / 10 != 0) {
                return singleDigitSum(sum);
            }
        }
        return sum;
    }
}