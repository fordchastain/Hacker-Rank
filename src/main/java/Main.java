import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("No agruments provided");
            return;
        }

        if (args[0].equals("simple-array-sum")) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            System.out.println(HackerRank.simpleArraySum(arr));
        }

        if (args[0].equals("compare-the-triplets")) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++)
                a[i] = sc.nextInt();

            int[] b = new int[3];
            for (int i = 0; i < 3; i++)
                b[i] = sc.nextInt();

            int[] result = HackerRank.compareTriplets(a, b);
            System.out.println(result[0] + " " + result[1]);
        }

        if (args[0].equals("birthday-cake-candles")) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                    
            System.out.println(HackerRank.birthdayCakeCandles(arr));
        }

        if (args[0].equals("time-conversion")) {
            String str = sc.next();
            System.out.println(HackerRank.timeConversion(str));
        }

        if (args[0].equals("lisa-workbook")) {
            int length = sc.nextInt();
            int chapters = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) 
                arr[i] = sc.nextInt();
        
            System.out.println(HackerRank.lisasWorkbook(arr, chapters));
        }

        if (args[0].equals("grading")) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = sc.nextInt();
            for (int i : HackerRank.gradingStudents(array))
                System.out.println(i);
        }

        if (args[0].equals("apple-and-orange")) {
            int s = sc.nextInt(), t = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt();
            int[] apples = new int[m], oranges = new int[n];
            for (int i = 0; i < m; i++)
                apples[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                oranges[i] = sc.nextInt();
            for (int i : HackerRank.countApplesAndOranges(s, t, a, b, apples, oranges))
                System.out.println(i);
        }


        if (args[0].equals("diagonal-difference")) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            System.out.println(HackerRank.diagonalDifference(arr));
        }

        if (args[0].equals("climb-the-leaderboard")) {
            int n = sc.nextInt();
            int[] ranked = new int[n];
            for (int i = 0; i < n; i++)
                ranked[i] = sc.nextInt();
            int m = sc.nextInt();
            int[] player = new int[m];
            for (int i = 0; i < m; i++) 
                player[i] = sc.nextInt();
     
            for (int i : HackerRank.climbingTheLeaderboard(ranked, player))
                System.out.println(i);
        }

        if (args[0].equals("the-hurdle-race")) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++)
                height[i] = sc.nextInt();
            System.out.println(HackerRank.hurdleRace(k, height));
        }

        if (args[0].equals("organizing-containers-of-balls")) {
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int n = sc.nextInt();
                int[][] m = new int[n][n];
                for (int j = 0; j < n; j++)
                    for (int k = 0; k < n; k++)
                        m[j][k] = sc.nextInt();
                System.out.println(HackerRank.organizingContainers(m));
            }
        }

        if (args[0].equals("plus-minus")) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            for (double d : HackerRank.plusMinus(arr))
                System.out.println(d);
        }

    }
}