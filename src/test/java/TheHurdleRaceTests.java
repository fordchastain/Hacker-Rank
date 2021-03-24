import static org.junit.Assert.*;
import org.junit.Test;

public class TheHurdleRaceTests {

    @Test
    public void theHurdleRaceTest1() {
        assertEquals(2, HackerRank.hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
    }
    
    @Test
    public void theHurdleRaceTest2() {
        assertEquals(0, HackerRank.hurdleRace(7, new int[]{2, 5, 4, 5, 2}));
    }

    @Test
    public void theHurdleRaceTest3() {
        int[] testArr = {56, 61, 6, 83, 54, 85, 43, 21, 63, 76, 79, 39, 78, 84, 71, 10, 86, 58, 2, 35, 71, 23,
                         46, 21, 61, 64, 54, 6, 16, 36, 22, 3, 37, 25, 71, 66, 9, 80, 51, 58, 63, 84, 64, 38, 
                         66, 19, 47, 16, 66, 57, 73, 77, 13, 22, 79, 14, 5, 86, 5, 28, 81, 85, 59, 28, 67, 53, 
                         74, 47, 50, 70, 17, 61, 33, 38, 52, 64, 84, 51, 3, 58, 68, 80, 68, 38, 56, 12, 69, 34, 
                         21, 19, 83, 8, 84, 27, 5, 39, 5, 7, 44, 74};
        assertEquals(0, HackerRank.hurdleRace(87, testArr));
    }

    @Test 
    public void theHurdleRaceTest4() {
        int[] testArr = {86, 4, 83, 20, 6, 81, 58, 59, 53, 2, 54, 62, 25, 35, 79, 64, 27, 49, 32, 95, 100, 20, 58, 
                         39, 92, 30, 67, 89, 58, 81, 100, 66, 73, 29, 75, 81, 70, 55, 18, 28, 7, 35, 98, 52, 30, 
                         11, 69, 48, 84, 54, 13, 14, 15, 86, 34, 82, 92, 26, 8, 53, 62, 57, 50, 31, 61, 85, 88, 5, 
                         80, 64, 90, 52, 47, 43, 40, 93, 69, 70, 16, 43, 7, 25, 99, 12, 63, 99, 71, 76, 55, 17, 90, 
                         43, 27, 20, 42, 84, 39, 96, 75, 1};
        assertEquals(47, HackerRank.hurdleRace(53, testArr));
    }

    @Test
    public void theHurdleRaceTest5() {
        int[] testArr = {52, 99, 93, 84, 50, 64, 61, 87, 89, 97, 64, 69, 61, 90, 82, 53, 50, 63, 82, 87, 76, 78, 75, 
                         55, 80, 68, 75, 83, 69, 81, 95, 89, 60, 59, 90, 100, 90, 64, 53, 60, 88, 93, 62, 50, 75, 77, 
                         60, 93, 55, 79, 52, 47, 65, 74, 62, 60, 96, 49, 73, 92, 79, 54, 100, 81, 63, 58, 75, 80, 89, 
                         94, 52, 85, 57, 72, 97, 81, 97, 66, 84, 77, 83, 94, 85, 68, 99, 54, 64, 83, 67, 84, 81, 65, 
                         59, 89, 68, 91, 60, 79, 74, 57};
        assertEquals(53, HackerRank.hurdleRace(47, testArr));
    }
}