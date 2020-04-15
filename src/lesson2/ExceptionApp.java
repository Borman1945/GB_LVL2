package lesson2;

public class ExceptionApp {

    public static  void main(String... args){
        try {
            int a = 0;
            int b = divide(a);
            System.out.println("это сообщение не будет выведено в консоль");
            return;
       } catch (ArithmeticException | NullPointerException | NumberFormatException e){
            System.out.println("на ноль делить нельзя!");

        } finally {
            System.out.println("Finally");
        }

    }

    private static int divide(int a)  throws DivideByZeroException {
        if (a == 0){
            throw new DivideByZeroException();
        }
        return 10 / a;
    }
}
