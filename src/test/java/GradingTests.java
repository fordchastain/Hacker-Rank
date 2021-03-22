import static org.junit.Assert.*;
import org.junit.Test;

public class GradingTests {

    @Test
    public void gradingTest1() {
        int[] testArray = new int[]{73, 67, 38, 33};
        int[] resultArray = new int[]{75, 67, 40, 33};
        assertArrayEquals(resultArray, HackerRank.gradingStudents(testArray));
    }

    @Test
    public void gradingTest2() {
        int[] testArray = new int[]{37, 38};
        int[] resultArray = new int[]{37, 40};
        assertArrayEquals(resultArray, HackerRank.gradingStudents(testArray));
    }

    @Test
    public void gradingTest3() {
        int[] testArray = new int[]{80, 96, 18, 73, 78, 60, 60, 15, 45, 15, 10, 5,
                                    46, 87, 33, 60, 14, 71, 65, 2, 5, 97, 0};
        int[] resultArray = new int[]{80, 96, 18, 75, 80, 60, 60, 15, 45, 15, 10, 5,
                                      46, 87, 33, 60, 14, 71, 65, 2, 5, 97, 0};
        assertArrayEquals(resultArray, HackerRank.gradingStudents(testArray));
    }
}