import static org.junit.Assert.*;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by zeshanrasul on 15/04/2016.
 */
public class FizzBuzzTest {

    @Test
    public void getResultsShouldReturnFizzIfTheNumberIsDivisibleBy3() {
        assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResultsShouldReturnBuzzIfTheNumberIsDivisibleBy5() {
        assertEquals("buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void getResultsShouldReturnFizzBuzzIfTheNumberIsDivisibleBy15() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(15));
    }

    @Test
    public void getResultsShouldReturnNumberIfTheNumberIsNotDivisibleByAnyOfAbove() {
        assertEquals("11", FizzBuzz.getResult(11));
        assertEquals("0", FizzBuzz.getResult(0));

    }

}