public class Main {
    private static String RESULT = "HASIL =";
    private static String PLUS_OPERATOR = "+";
    private static String MINUS_OPERATOR = "-";
    private static String PLUS = "Penjumlahan ";
    private static String MINUS = "Pengurangan ";

    public static void main(String[] args) {
        Calculator calculator = new Calculator(3,1);

        System.out.println(PLUS + calculator.firstNumber + PLUS_OPERATOR + calculator.secondNumber);
        System.out.println(RESULT + calculator.plus());

        System.out.println(MINUS_OPERATOR + calculator.firstNumber + MINUS + calculator.secondNumber);
        System.out.println(RESULT + calculator.minus());
    }
}
