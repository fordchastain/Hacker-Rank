import static org.junit.Assert.*;
import org.junit.Test;

public class ClimbingTheLeaderboardTests {

    @Test
    public void climbingTheLeaderboardTest1() {
        int[] ranked = {100, 100, 50, 40, 40, 20, 10}, player = {5, 25, 50, 120};
        assertArrayEquals(new int[]{6, 4, 2, 1}, HackerRank.climbingTheLeaderboard(ranked, player));   
    }

    @Test public void climbingTheLeaderboardTest2() {
        int[] ranked = {100, 90, 90, 80}, player = {70, 80, 105};
        assertArrayEquals(new int[]{4, 3, 1}, HackerRank.climbingTheLeaderboard(ranked, player));
    }

    @Test public void climbingTheLeaderboardTest3() {
        int[] ranked = {80, 80, 80, 80, 50, 30, 25, 15}, player = {45, 50, 55};
        assertArrayEquals(new int[]{3, 2, 2}, HackerRank.climbingTheLeaderboard(ranked, player));
    }

}