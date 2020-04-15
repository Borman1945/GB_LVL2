package lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(){
        super("Размер массива, не совпадает c шаблоном 4X4");
    }
}
