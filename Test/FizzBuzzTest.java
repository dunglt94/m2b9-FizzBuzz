import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    @DisplayName("So chia het cho 3 thi chuoi la Fizz")
    public void TestGetFizzBuzzCaseDividedBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 12;

        String result = "Fizz";
        String actual = fizzBuzz.getFizzBuzz(number);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("So chia het cho 5 thi chuoi la Buzz")
    public void TestGetFizzBuzzCaseDividedBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 25;

        String result = "Buzz";
        String actual = fizzBuzz.getFizzBuzz(number);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("So chia het cho 3 va 5 thi chuoi la FizzBuzz")
    public void TestGetFizzBuzzCaseDividedBy3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 105;

        String result = "FizzBuzz";
        String actual = fizzBuzz.getFizzBuzz(number);
        assertEquals(result, actual);
    }

    @Test
    @DisplayName("So nhap vao co chua so 3 the ket qua la Fizz")
    public void TestGetFizzBuzzCaseNumberContain3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 13;

        String result = "Fizz";
        String actual = fizzBuzz.getFizzBuzz(number);
        assertEquals(result, actual);
    }

}