package academy.learnprogramming;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator() {
        this(420,69);
        System.out.println("Empty constructor called");
    }

    public SimpleCalculator(double firstNumber, double secondNumber) {
        System.out.println("Custom constructor called");
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }


    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult() {
        if (this.secondNumber==0) {
            return 0;
        } else {
            return this.firstNumber / this.secondNumber;
        }
    }
}
