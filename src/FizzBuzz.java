public class FizzBuzz {

    public static final String CONCAT_STRING = " ";
    public static final String FIRST_DIGIT_OF_TWO_DIGIT_NUMBER_LESS_THAN_10 = "muoi";

    public String getFizzBuzz(int number) {
        String result;
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        if (isDividedBy3 && isDividedBy5 || contains3 && contains5) {
            result = "FizzBuzz";
        } else if (isDividedBy3 || contains3) {
            result = "Fizz";
        } else if (isDividedBy5 || contains5) {
            result = "Buzz";
        } else {
            result = readNumberAsWord(number);
        }
        return result;
    }

    public String readNumberAsWord(int number) {
        String result = "";
        String numberString =  String.valueOf(number);
        String firstDigit = getWordFromNumber(numberString.charAt(0));

        boolean numberFrom1To9 = number > 0 && number < 10;
        boolean numberFrom10To19 = number < 20;
        boolean numberFrom20To99 = number < 100;

        if (numberFrom1To9) {
            result =  firstDigit;
        } else {
            String secondDigit = getWordFromNumber(numberString.charAt(1));

            if (numberFrom10To19) {
                result =  FIRST_DIGIT_OF_TWO_DIGIT_NUMBER_LESS_THAN_10 + CONCAT_STRING + secondDigit;
            } else {
                if (numberFrom20To99) {
                    result = firstDigit + CONCAT_STRING + secondDigit;
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
