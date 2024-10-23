
public class Main {
    public static void main(String[] args){
       
        try {
            new MathOp();
            MathOp.performOperation("+", 5, 4);
            MathOp.performOperation("*", 9, 4);
            MathOp.performOperation("%", 9, 4);
            MathOp.performOperation("^", 2, 5);
            MathOp.performOperation("&", 9, 5);

         } catch (CustomUnsupportedOperationException e) {
            Logging.logger(e);
            System.err.println("Error occurred: " + e.getMessage());
         }
    }
    
}
