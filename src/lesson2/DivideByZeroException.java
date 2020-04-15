package lesson2;

public class DivideByZeroException extends ArithmeticException{
    public DivideByZeroException() {
        super("Коше делить на ноль, запрет!");
    }
}
