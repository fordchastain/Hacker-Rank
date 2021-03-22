import java.util.*;

public final class HackerRank {
    
    /* https://www.hackerrank.com/challenges/simple-array-sum/problem */
    static int simpleArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    /* https://www.hackerrank.com/challenges/compare-the-triplets/problem */
    static int[] compareTriplets(int[] a, int[] b) {
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                result[0]++;
            }
            else if (b[i] > a[i]) {
                result[1]++;
            }
        }
        return result;
    }
    
    /* https://www.hackerrank.com/challenges/birthday-cake-candles/problem */
    static int birthdayCakeCandles(int[] candles) {
        int result = 0, tallest = 0;
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] == tallest) {
                result++;
            }
            else if (candles[i] > tallest) {
                tallest = candles[i];
                result = 1;
            }
        }
        return result;
    }
    
    /* https://www.hackerrank.com/challenges/time-conversion/problem */
    static String timeConversion(String s) {
        String result = "";
        String[] str = s.split(":");
        if (str[2].contains("AM")) {
            result += (str[0].equals("12") ? "00" : str[0]) + ":" + str[1] + ":" + str[2].substring(0, 2);
        }
        else {
            int num = Integer.parseInt(str[0]);
            result += (num == 12 ? str[0] : "" + (12 + num)) + ":" + str[1] + ":" + str[2].substring(0, 2);
        }
        return result;
    }
    
    
    /* https://www.hackerrank.com/challenges/lisa-workbook/problem */
    static int lisasWorkbook(int[] arr, int n) {
        int result = 0, page = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                if (j != 0 && j % n == 0) page++;
                if (page == j) result++;
            }
            page++;
        }
        return result;
    }

    /* https://www.hackerrank.com/challenges/grading/problem */
    static int[] gradingStudents(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 38) continue;
            int nextMultipleOf5 = 5 * (int)Math.ceil(array[i]/5.0);
            if (nextMultipleOf5 - array[i] < 3) array[i] = nextMultipleOf5;
        }
        return array;
    }

    /* https://www.hackerrank.com/challenges/apple-and-orange/problem */
    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0, orangeCount = 0;
        for (int i = 0; i < apples.length; i++){
            if (apples[i] + a >= s && apples[i] + a <= t)
                appleCount++;
        }
        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] + b >= s && oranges[i] + b <= t)
                orangeCount++;
        }
        return new int[]{appleCount, orangeCount};
    }

    /* https://www.hackerrank.com/challenges/diagonal-difference/problem */
    static int diagonalDifference(int[][] arr) {
        int primaryDiagonal = 0, secondaryDiagonal = 0;
        for (int i = 0; i < arr.length; i++)
            primaryDiagonal += arr[i][i];
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--)
            secondaryDiagonal += arr[i][j];
        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

}