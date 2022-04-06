package homework4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneDirectory = new HashMap<>();
        phoneDirectory.put("Max", "9159995588");
        phoneDirectory.put("Yaroslav", "9109995588");
        phoneDirectory.put("Max", "9159991488");
        phoneDirectory.put("Vyacheslav", "9099995588");
        phoneDirectory.put("Max", "9879999988");
        System.out.println(phoneDirectory);
    }

}
