public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int plus(){
        return firstNumber + secondNumber;
    }

    public int minus(){
        return firstNumber - secondNumber;
    }
}
