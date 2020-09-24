package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car tesla = new Car();
        Car holden = new Car();
        tesla.setModel("Model3");
        System.out.println("Model is "+tesla.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
//        SimpleCalculator calculator = new SimpleCalculator(2,3);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());

//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= "+calculator.getAdditionResult());
//        System.out.println("subtract= "+calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= "+calculator.getMultiplicationResult());
//        System.out.println("divide= "+calculator.getDivisionResult());

    }
}
