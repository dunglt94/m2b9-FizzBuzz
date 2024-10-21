public class FizzBuzz {

    public static final String CONCAT_STRING = " ";
    public static final String FIRST_DIGIT_OF_TWO_DIGIT_NUMBER_LESS_THAN_10 = "muoi";

    public String getFizzBuzz(int number) {
        String result = "";
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;

        String numberString =  String.valueOf(number);
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        if (isDividedBy3 && isDividedBy5 || contains3 && contains5) {
            result = "FizzBuzz";
        } else if (isDividedBy3 || contains3) {
            result = "Fizz";
        } else if (isDividedBy5 || contains5) {
            result = "Buzz";
        } else {
            String firstNumber = getWordFromNumber(numberString.charAt(0));
            String secondNumber = getWordFromNumber(numberString.charAt(1));
            if (number > 0 && number < 10) {
                result = firstNumber;
            } else {
                if (number < 20) {
                    result = FIRST_DIGIT_OF_TWO_DIGIT_NUMBER_LESS_THAN_10 + CONCAT_STRING + secondNumber;
                } else if (number < 100) {
                    result = firstNumber + CONCAT_STRING + secondNumber;
                }
            }
        }
        return result;
    }

    public String getWordFromNumber(char number) {
        switch (number) {
            case '0':
                return "muoi";
            case '1':
                return "mot";
            case '2':
                return "hai";
            case '3':
                return "ba";
            case '4':
                return "bon";
            case '5':
                return "nam";
            case '6':
                return "sau";
            case '7':
                return "bay";
            case '8':
                return "tam";
            case '9':
                return"chin";
            default:
                return"";
        }
    }
}
