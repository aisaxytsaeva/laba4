
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
    public static void main(String[] args)throws IOException{
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try{
             fin = new FileInputStream(args[0]);
             fout = new FileOutputStream(args[1]);
            
        }catch (FileNotFoundException e) {
            System.err.printf("Файл '%s' не найден.\n", args[0]);
        }
        try {
            i = fin.read();
            while (i != -1){fout.write(i);};
        } 
        catch (IOException e) {
            System.out.printf("Ошибка записи файла: ", e.getMessage());
        }
        finally{
            try {
                fin.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                fout.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }  
    }
}
