public class FizzBuzz {
    public String getFizzBuzz(int number) {
        String result = "";
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;

        String numberString;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");
        if (isDividedBy3 && isDividedBy5 || contains3 && contains5) {
            result = "FizzBuzz";
        } else if (isDividedBy3 || contains3) {
            result = "Fizz";
        } else if (isDividedBy5 || contains5) {
            result = "Buzz";
        }


        return result;
    }

//    public String getWordFromNumber(char number) {
//        switch (number) {
//            case '0':
//                return "muoi";
//            case "1":
//                return "mot";
//            case "2":
//                return "hai";
//            case "3":
//                return "ba";
//            case "4":
//                return "bon";
//            case "5":
//                return "nam";
//            case "6":
//                return "sau";
//            case "7":
//                return "bay";
//            case "8":
//                return "tam";
//            case "9":
//                return"chin";
//            default:
//                return"";
//        }
//    }
}
