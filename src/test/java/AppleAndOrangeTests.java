import static org.junit.Assert.*;
import org.junit.Test;

public class AppleAndOrangeTests {

    @Test
    public void appleAndOrangeTest1() {
        int s = 7, t = 11, a = 5, b = 15;
        int[] apples = {-2, 2, 1}, oranges = {5, -6}, result = {1, 1};
        assertArrayEquals(result, HackerRank.countApplesAndOranges(s, t, a, b, apples, oranges));
    }

    @Test
    public void appleAndOrangeTest2() {
        int s = 2, t = 3, a = 1, b = 5;
        int[] apples = {-2}, oranges = {-1}, result = {0, 0};
        assertArrayEquals(result, HackerRank.countApplesAndOranges(s, t, a, b, apples, oranges));
    }

    @Test
    public void appleAndOrangeTest3() {
        int s = 2, t = 3, a = 1, b = 5;
        int[] apples = {2}, oranges = {-2}, result = {1, 1};
        assertArrayEquals(result, HackerRank.countApplesAndOranges(s, t, a, b, apples, oranges));
    }
}