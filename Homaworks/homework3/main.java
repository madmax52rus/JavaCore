package homework3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         ArrayList<Integer> orange = new ArrayList<>();
         orange.add(1);
         orange.add(1);
         orange.add(1);
         orange.add(1);
         orange.add(1);
         System.out.println("апельсинов в коробке = "+ orange.size());

        ArrayList<Integer> apple = new ArrayList<>();
        apple.add(2);
        apple.add(2);
        apple.add(2);
        System.out.println("яблок в коробке = " + apple.size());
    }
}
