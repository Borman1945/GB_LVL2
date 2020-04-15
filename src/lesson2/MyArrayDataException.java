package lesson2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int arr1,int arr2){
        super("Неверный формат данных в ячейке[" + arr1 + "][" + arr2 + "]");
    }
}
