public class HelloJava {

    public static void main(String[] args) {
        System.out.println(getSecondDigit(789));
        System.out.println(getSecondDigit(12));
        System.out.println(getSecondDigit(4563));
        System.out.println(getFirstDigit(12345));
        System.out.println(getFirstDigit(67));
        System.out.println(getFirstDigit(890));
    }

        public static int getFirstDigit(int number) {
            String numberString = Integer.toString(number);
            return Integer.parseInt(numberString.substring(0, numberString.length()-1));
        }
        public static int getSecondDigit(int number) {
            String numberString = Integer.toString(number);
            return Integer.parseInt(numberString.substring(numberString.length()-1));
        }
}
