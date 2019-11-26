public class Main {
    private static String RESULT = "HASIL =";
    private static String PLUS_OPERATOR = "+";
    private static String MINUS_OPERATOR = "-";
    private static String PLUS = "Penjumlahan ";
    private static String MINUS = "Pengurangan ";
    private static String MULTIPLY_OPERATOR = "*";
    private static String DIVISION_OPERATOR = "/";
    private static String MULTIPLY = "Perkalian ";
    private static String DIVISION = "Pembagian ";
    private static String POWER = "Pemangkatan ";
    private static String POWER_OPERATOR = " ** ";

    public static void main(String[] args) {
        Calculator calculator = new Calculator(3,1);

        System.out.println(PLUS + calculator.firstNumber + PLUS_OPERATOR + calculator.secondNumber);
        System.out.println(RESULT + calculator.plus());

        System.out.println(MINUS + calculator.firstNumber + MINUS_OPERATOR + calculator.secondNumber);
        System.out.println(RESULT + calculator.minus());

        System.out.println(MULTIPLY + calculator.firstNumber + MULTIPLY_OPERATOR + calculator.secondNumber);
        System.out.println(RESULT + calculator.multiply());

        System.out.println(DIVISION + calculator.firstNumber + DIVISION_OPERATOR + calculator.secondNumber);
        System.out.println(RESULT + calculator.division());

		int operand = 2;
        int multiplier = 11;
        System.out.println(POWER + operand + POWER_OPERATOR + multiplier);
        System.out.println(RESULT + calculator.pow(operand, multiplier));
    }
}
