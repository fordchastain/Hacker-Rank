import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleArraySumTests {

	@Test
	public void simpleArraySumTest1() {
		int[] arr = {1, 2, 3, 4, 10, 11};
		assertEquals(31, HackerRank.simpleArraySum(arr));
	}

	@Test
	public void simpleArraySumTest2() {
		int[] arr = {338, 65, 713, 595, 428, 610, 728, 573, 871, 868};
		assertEquals(5789, HackerRank.simpleArraySum(arr));
	}

	@Test
	public void simpleArraySumTest3() {
		int[] arr = {854, 55, 968, 552, 71, 231, 45, 213, 9, 127, 88};
		assertEquals(3213, HackerRank.simpleArraySum(arr));
	}

}