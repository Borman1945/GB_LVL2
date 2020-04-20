package lesson2;

public class ArraFunction {

    static final int ARR_LENGTH = 4;

    static void checkArr(String[][] arr) {
        if (arr.length != ARR_LENGTH) {
            throw new MyArraySizeException();
        } else if (arr[arr.length - 1].length != ARR_LENGTH) {
            throw new MyArraySizeException();
        }

    }

    static int passArraySumm(String[][] arr) {
        int sum = 0;
        int varray = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(System.lineSeparator());
            String[] row = arr[i];
            for (int j = 0; j < row.length; j++) {
                try {
                    varray = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                System.out.print(arr[i][j] + "\t");
                sum = sum + varray;
            }
        } return sum;
    }

}
