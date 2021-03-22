import static org.junit.Assert.*;
import org.junit.Test;

public class CompareTheTripletsTests {

	@Test
	public void compareTheTripletsTest1() {
		int[] a = {5, 6, 7}, b = {3, 6, 10}, result = {1,1};
		assertArrayEquals(result, HackerRank.compareTriplets(a, b));
	}

	@Test
	public void compareTheTripletsTest2() {
		int[] a = {17, 28, 30}, b = {99, 16, 8}, result = {2, 1};
		assertArrayEquals(result, HackerRank.compareTriplets(a, b));
	}

	@Test
	public void compareTheTripletsTest3() {
		int[] a = {1, 1, 1}, b = {1, 1, 1}, result = {0, 0};
		assertArrayEquals(result, HackerRank.compareTriplets(a, b));
	}

	@Test
	public void compareTheTripletsTest4() {
		int[] a = {1, 2, 3}, b = {2, 3, 4}, result = {0, 3};
		assertArrayEquals(result, HackerRank.compareTriplets(a, b));
	}

	@Test
	public void compareTheTripletsTest5() {
		int[] a = {101, 52, 31}, b = {21, 37, 14}, result = {3, 0};
		assertArrayEquals(result, HackerRank.compareTriplets(a, b));
	}
}