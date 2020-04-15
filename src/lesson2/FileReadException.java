package lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadException {

    public static void main(String... args){
       // FileInputStream fis = null;
        try (FileInputStream fis = new FileInputStream("test_lesson2.txt")){
            byte[] byetes = fis.readAllBytes();
            System.out.println(new String(byetes));
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Файл повердежен");
        } /*finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
