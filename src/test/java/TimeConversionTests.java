import static org.junit.Assert.*;
import org.junit.Test;

public class TimeConversionTests {

    @Test
    public void timeConversionTest1() {
        assertEquals("19:05:45", HackerRank.timeConversion("07:05:45PM"));
    }
    
    @Test
    public void timeConversionTest2() {
        assertEquals("00:40:22", HackerRank.timeConversion("12:40:22AM"));
    }

    @Test
    public void timeConversionTest3() {
        assertEquals("06:40:03", HackerRank.timeConversion("06:40:03AM"));
    }

    @Test
    public void timeConversionTest4() {
        assertEquals("00:05:39", HackerRank.timeConversion("12:05:39AM"));
    }

    @Test
    public void timeConversionTest5() {
        assertEquals("12:45:54", HackerRank.timeConversion("12:45:54PM"));
    }
}