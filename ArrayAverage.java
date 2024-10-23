
public class ArrayAverage{
    public static void main(String[] args){
        

        Object arr [] = {1, 2, 3, 4, 5, "stringjava"};
        int sum = 0;
        int count = 0;


        try {
            for (Object arr1 : arr) {
                try {
                    sum += (int) arr1;
                    count++;
                } catch (ClassCastException e) {
                    System.err.println("This element " + arr1 + " isn't type of int");
                }
            }
            double avg = sum/count;
            System.out.println("The average is " + avg);
            }catch(IndexOutOfBoundsException e){
                System.out.println("Array index out boundaries");
            }
        
    }
}
        

        

        



