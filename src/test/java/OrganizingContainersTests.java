import static org.junit.Assert.*;
import org.junit.Test;

public class OrganizingContainersTests {

    @Test
    public void organizingContainersTest1() {
        int[][] testArr = {{1, 1}, {1, 1}};
        assertEquals("Possible", HackerRank.organizingContainers(testArr));
    }
    
    @Test
    public void organizingContainersTest2() {
        int[][] testArr = {{0, 2}, {1, 1}};
        assertEquals("Impossible", HackerRank.organizingContainers(testArr));
    }

    @Test
    public void organizingContainersTest3() {
        int[][] testArr = {{1, 3, 1}, {2, 1, 2}, {3, 3, 3}};
        assertEquals("Impossible", HackerRank.organizingContainers(testArr));
    }

    @Test
    public void organizingContainersTest4() {
        int[][] testArr = {{0, 2, 1}, {1, 1, 1}, {2, 0, 0}};
        assertEquals("Possible", HackerRank.organizingContainers(testArr));
    }

    @Test
    public void organizingContainersTest5() {
        int[][] testArr = {{999336263, 998799923}, {998799923, 999763019}};
        assertEquals("Possible", HackerRank.organizingContainers(testArr));
    }

    @Test
    public void organizingContainersTest6() {
        int[][] testArr = {{997612619, 934920795, 998879231, 999926463},
                           {960369681, 997828120, 999792735, 979622676},
                           {999013654, 998634077, 997988323, 958769423},
                           {997409523, 999301350, 940952923, 993020546}};
        assertEquals("Possible", HackerRank.organizingContainers(testArr));
    }
    
}