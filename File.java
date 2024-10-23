
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
    public static void main(String[] args)throws IOException{
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length !=2){
            System.out.println("Использование: File откуда куда");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do { 
                i = fin.read();
                fout.write(i);
            } while (i != -1);
        }catch (FileNotFoundException e) {
            System.err.printf("Файл '%s' не найден.\n", args[0]);
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
