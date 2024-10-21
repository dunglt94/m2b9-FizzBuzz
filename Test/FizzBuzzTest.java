import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    @DisplayName("So chia het cho 3 thi chuoi la Fizz")
    public void TestGetFizzBuzzCaseDividedBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;

        String result = "Fizz";
        String actual = fizzBuzz.getFizzBuzz(number);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("So chia het cho 5 thi chuoi la Buzz")
    public void TestGetFizzBuzzCaseDividedBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;

        String result = "Buzz";
        String actual = fizzBuzz.getFizzBuzz(number);
        assertEquals(result, actual);
    }

}