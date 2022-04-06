package homework4;

import java.util.*;

public class Words {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>(); //("Renault", "Lada", "Mitsubishi", "Toyota", "Lada", "Nissan", "Nissan", "Honda", "Dacia", "Alfa Romeo");
        wordList.add("Renault");
        wordList.add("Lada");
        wordList.add("Mitsubishi");
        wordList.add("Toyota");
        wordList.add("Lada");
        wordList.add("Nissan");
        wordList.add("Nissan");
        wordList.add("Lada");
        wordList.add("Lada");
        wordList.add("Alfa Romeo");
        System.out.println(wordList);

        HashSet<String> wordListHashSet = new HashSet<String>(wordList) ;
        System.out.println(wordListHashSet + " - this list of unique words");
        System.out.println(wordListHashSet.size() + " - number of unique words");

        HashMap<String, Integer> num = new HashMap<>();
        for (String word : wordList) {
            num.put(word, num.getOrDefault(word, 0) + 1);
        }
        System.out.println(num);
        }
}
