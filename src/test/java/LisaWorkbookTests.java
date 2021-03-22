import static org.junit.Assert.*;
import org.junit.Test;

public class LisaWorkbookTests {

    @Test
    public void lisaWorkbookTest1() {
        int[] arr = {4, 2, 6, 1, 10};
        int n = 3;
        assertEquals(4, HackerRank.lisasWorkbook(arr, n));
    }

    @Test
    public void lisaWorkbookTest2() {
        int[] arr = {3, 8, 15, 11, 14, 1, 9, 2, 24, 31};
        int n = 5;
        assertEquals(8, HackerRank.lisasWorkbook(arr, n));
    }

    @Test
    public void lisaWorkbookTest3() {
        int[] arr = {1, 8, 19, 15, 2, 29, 3, 2, 25, 2, 19, 26, 17, 33, 22};
        int n = 20;
        assertEquals(11, HackerRank.lisasWorkbook(arr, n));
    }

    @Test
    public void lisaWorkbookTest4() {
        int[] arr = {1, 29, 94, 15, 87, 100, 20, 55, 100, 45, 82, 80, 100, 100, 
                     3, 53, 100, 2, 100, 100, 100, 100, 100, 100, 1};
        int n = 10;
        assertEquals(11, HackerRank.lisasWorkbook(arr, n));
    }
}