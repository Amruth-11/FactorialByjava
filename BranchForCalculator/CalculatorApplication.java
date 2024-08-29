public class CalculatorApplication {

    public static void main(String[] args) {
     
        double firstNumber = 10; 
        double secondNumber = 5;  
        String operator = "+";

        double result;

        
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber 
                break;
            case "-":
                result = firstNumber - secondNumber 
                break;
            case "*":
                result = firstNumber * secondNumber 
                break;
            case "/":
                if secondNumber == 0) {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                result = firstNumber / secondNumber ;
                break;
            default:
                System.out.println("Invalid operator. Use +, -, *, or /.");
                return;
        }

       
        System.out.println("Result: " + result);
    }
}
