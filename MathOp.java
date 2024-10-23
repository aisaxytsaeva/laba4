import java.util.Arrays;
import java.util.List;
public  class MathOp{
    private static final List<String> operations = Arrays.asList("+", "-", "*", "/");

    public static void performOperation(String operation, int a, int b) throws CustomUnsupportedOperationException {
    
        switch (operation) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            default -> throw new CustomUnsupportedOperationException("Operation '" + operation + "' is not supported.");
        }    
    }

    public static void main(String[] args) {
        try {
            MathOp oper = new MathOp();
            MathOp.performOperation("+", 5, 4);
            MathOp.performOperation("%", 9, 4);
        } catch (CustomUnsupportedOperationException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
        
    }
}