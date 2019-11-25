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
    public int multiply(){
        return firstNumber * secondNumber;
    }
    public int division(){
        return firstNumber / secondNumber;
    }

    public int pow(int operand, int multiplier){
        if(multiplier == 0) return 1;
        return operand * pow(operand, multiplier - 1);
    }

}
