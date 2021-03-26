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

    /* https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem */
    static int[] climbingTheLeaderboard(int[] ranked, int[] player) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int rank = 1;
        for (int i : ranked)
            if (!map.containsKey(i)) map.put(i, rank++);
            
        int[] result = new int[player.length];
        for (int i = 0; i < player.length; i++) {
            Integer key = map.put(player[i], null);
            result[i] = (map.higherEntry(player[i]) == null ? 1 : map.higherEntry(player[i]).getValue()+1);
            map.remove(player[i]);
        }
        return result;
    }

    /* https://www.hackerrank.com/challenges/the-hurdle-race/problem */
    static int hurdleRace(int k, int[] height) {
        int highest = 0;
        for (int i : height)
            if (i > highest) highest = i;
        return (highest > k ? highest - k : 0);
    }

    /* https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem */
    static String organizingContainers(int[][] container) {
        List<Integer> rowSums = new ArrayList<Integer>(), colSums = new ArrayList<Integer>();
        for (int i = 0; i < container.length; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < container.length; j++) {
                rowSum += container[i][j];
                colSum += container[j][i];
            }
            rowSums.add(rowSum);
            colSums.add(colSum);
        }
        return (rowSums.containsAll(colSums) ? "Possible" : "Impossible");
    }

    /* https://www.hackerrank.com/challenges/plus-minus/problem */
    static double[] plusMinus(int[] arr) {
        double n = arr.length;
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) pos++;
            if (arr[i] < 0) neg++;
            if (arr[i] == 0) zero++;
        }
        return new double[]{pos/n, neg/n, zero/n}; 
    }

}