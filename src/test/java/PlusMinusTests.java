import static org.junit.Assert.*;
import org.junit.Test;

public class PlusMinusTests {

    @Test
    public void plusMinusTest1() {
    	int[] testArr = {-4, 3, -9, 0, 4, 1};
    	double[] resultArr = {0.500000, 0.333333, 0.166667};
    	assertArrayEquals(resultArr, HackerRank.plusMinus(testArr), 4);
    }

    @Test 
    public void plusMinusTest2() {
    	int[] testArr = {1, 2, 3, -1, -2, -3, 0, 0};
    	double[] resultArr = {0.375000, 0.375000, 0.250000};
    	assertArrayEquals(resultArr, HackerRank.plusMinus(testArr), 4);
    }

    @Test 
    public void plusMinusTest3() {
    	int[] testArr = {0, 0, -1, 1, 1};
    	double[] resultArr = {0.400000, 0.200000, 0.400000};
    	assertArrayEquals(resultArr, HackerRank.plusMinus(testArr), 4);
    }

    @Test 
    public void plusMinusTest4() {
    	int[] testArr = {1, -2, -7, 9, 1, -8, -5};
    	double[] resultArr = {0.428571, 0.571429, 0.000000};
    	assertArrayEquals(resultArr, HackerRank.plusMinus(testArr), 4);
    }

    @Test 
    public void plusMinusTest5() {
    	int[] testArr = {0, 4, -3, 3, -6};
    	double[] resultArr = {0.400000, 0.400000, 0.200000};
    	assertArrayEquals(resultArr, HackerRank.plusMinus(testArr), 4);
    }

}