public class HelloJava {

    public static void main(String[] args) {
        System.out.println(getFirstDigit(15));
        System.out.println(getSecondDigit(15));
    }

        public static int getFirstDigit(int number) {
            String numberString = Integer.toString(number);
            String firstSymbol = numberString.substring(0,1);
            return Integer.parseInt(firstSymbol);
        }
        public static int getSecondDigit(int number) {
            String numberString = Integer.toString(number);
            String secondSymbol = numberString.substring(1,2);
            return Integer.parseInt(secondSymbol);
        }
}