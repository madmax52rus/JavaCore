package homework3;
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

    public double getWeight() {
       return array.length * Fruit.getWeight();
    }
}