package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T  extends Fruit> {
    private T[] array;

    public Box(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Box{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {

        Box<double>[] orangeBox = new Box();
        Box[] appleBox =  new Box(10);

       /**  ArrayList<Integer> orange = new ArrayList();
        orange.add(1);
        orange.add(1);
        orange.add(1);
        orange.add(1);
        orange.add(1);
        System.out.println("апельсинов в коробке = "+ orange.size());

        ArrayList<Integer> apple = new ArrayList();
        apple.add(2);
        apple.add(2);
        apple.add(2);
        System.out.println("яблок в коробке = " + apple.size()); **/
    }
    public double calcWeight() {
        double sum = 0.0;

        for (T num  : array) {
            sum = sum + num;
        }

        return sum;
    }

}
