package lesson2;

public class TestException {

    public static void main(String... args) {
        String[][] arr = {{"2","3","234","2"},{"1","2","4","4"},{"2","1","4","5"},{"1","33","4","5"} };

        try {
            ArraFunction.checkArr(arr);
            System.out.println("= " + ArraFunction.passArraySumm(arr));
        } catch (MyArraySizeException | MyArrayDataException e ){
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }



}
