import static org.junit.Assert.*;
import org.junit.Test;

public class BirthdayCakeCandlesTests {

    @Test
    public void birthdayCakeCandlesTest1() {
        int[] arr = {3, 2, 1, 3};
        assertEquals(2, HackerRank.birthdayCakeCandles(arr));
    }

    @Test
    public void birthdayCakeCandlesTest2() {
        int[] arr = {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
        assertEquals(5, HackerRank.birthdayCakeCandles(arr));
    }

    @Test
    public void birthdayCakeCandlesTest3() {
        int[] arr = {82, 49, 82, 82, 41, 82, 15, 63, 38, 25};
        assertEquals(4, HackerRank.birthdayCakeCandles(arr));
    }

    @Test
    public void birthdayCakeCandlesTest4() {
        int[] arr = {44, 53, 31, 27, 77, 60, 66, 77, 26, 36};
        assertEquals(2, HackerRank.birthdayCakeCandles(arr));
    }
    
}