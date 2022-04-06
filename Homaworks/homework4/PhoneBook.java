package homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class PhoneBook {

   private HashMap<String, ArrayList<String>> phoneDirectory = new HashMap<>();

   public void add(String name, String phone) {
       ArrayList<String> abonentName = phoneDirectory.getOrDefault(name, new ArrayList<>());
       abonentName.add(phone);
       phoneDirectory.put(name, abonentName);
   }

   public ArrayList<String> get(String name) {
       return phoneDirectory.get(name);
   }

    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Max", "915999");
        phonebook.add("Yaroslav", "910999");
        phonebook.add("Max", "915988");
        phonebook.add("Vyacheslav", "909999");
        phonebook.add("Max", "987999");

        System.out.println(phonebook.get("Max"));
    }
}
