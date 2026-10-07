import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberProgramTest {

    @Test
    public void testBasicArray() {
        int[] values = {3, 7, 2, 9, 5};
        assertEquals(9, NumberProgram.findResult(values));
    }

    @Test
    public void testNegativeNumbers() {
        int[] values = {-10, -3, -50, -1};
        assertEquals(-1, NumberProgram.findResult(values));
    }

    @Test
    public void testSingleValue() {
        int[] values = {42};
        assertEquals(42, NumberProgram.findResult(values));
    }

    @Test
    public void testEmptyArray() {
        int[] values = {};
        assertEquals(Integer.MIN_VALUE, NumberProgram.findResult(values));
    }

}