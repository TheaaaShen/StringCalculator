import org.junit.Test;

import static org.junit.Assert.*;

public class stringCalculatorTest {
//    @Test (expected=RuntimeException.class)
//    public void moreThanTwoNumbersInInput() {
//        stringCalculator.add("1,2,3");
//    }

    @Test
    public void twoNumbersInInput() {
        stringCalculator.add("1,2");
        assertTrue(true);
    }

    @Test (expected=RuntimeException.class)
    public void oneNumberInInput() {
        stringCalculator.add("2, X");
    }

    @Test
    public void emptyStringIsPassed() {
        assertEquals(0,stringCalculator.add(""));
    }

    @Test
    public void oneNumberIsPassedResult() {
        assertEquals(3,stringCalculator.add("3"));
    }

    @Test
    public void twoNumbersArePassedResult() {
        assertEquals(4, stringCalculator.add("1,3"));
    }

    @Test
    public void unknownAmountOfNumbersArePassedResult() {
        assertEquals(1+2+3+4+5, stringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void newLineIsInInput() {
        assertEquals(3+5+6, stringCalculator.add("3,5n6"));
    }
}