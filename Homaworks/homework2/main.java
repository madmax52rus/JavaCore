package lesson2.homework2;
import java.lang.String;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        java.lang.String[][] correctArray = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        java.lang.String[][] incorrectSizeArray = new String[][]{
                {"1", "2", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        java.lang.String[][] incorrectDataArray = new String[][]{
                {"1", "2", "3", "A"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        System.out.println();

        try {
            arrCorrect(incorrectSizeArray); }
        catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        arrCorrect(incorrectSizeArray);

    }


    public static int arrCorrect(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
            if (arr.length != 4) {
            throw new MyArraySizeException("Некорректная размерность массива -" + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(java.lang.String.valueOf(arr[i][j]));
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
