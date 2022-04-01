package homework3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private T master;

    public Box(T master) {
        this.master = master;
    }

    public T getMaster() {
        return master;
    }

    public void setMaster(T master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Box {" +
                " master = " + master +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Integer> orange = new ArrayList();
        orange.add(1);
        orange.add(1);
        orange.add(1);
        orange.add(1);
        orange.add(1);
        System.out.println(orange.size() + " апельсинов в коробке");

        ArrayList<Integer> apple = new ArrayList();
        apple.add(2);
        apple.add(2);
        apple.add(2);
        System.out.println(apple.size() + " яблока в коробке");
    }


}
