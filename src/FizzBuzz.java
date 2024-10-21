public class FizzBuzz {
    public String getFizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                result = "FizzBuzz";
            } else {
                result = "Fizz";
            }
        } else if (number % 5 == 0) {
            result = "Buzz";
        }

        return result;
    }
}
