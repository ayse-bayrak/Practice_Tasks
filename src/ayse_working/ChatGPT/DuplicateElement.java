package ayse_working.ChatGPT;
import java.util.HashSet;
import java.util.ArrayList;

public class DuplicateElement {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ayse");
        names.add("Ziya");
        names.add("Akif");
        names.add("Mahir");
        names.add("Betul");
        names.add("Ayse");
        names.add("Ziya");

        HashSet<String> uniqueNames = new HashSet<>(names);
        names.clear();
        names.addAll(uniqueNames);

        System.out.println(names);

        ArrayList<String> names2 = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {

            if (!names2.contains(names.get(i))) {
                names2.add(names.get(i));
            }
        }

//        for (int i = 0; i < names.size(); i++) {
//            for (int i1 = 0; i1 < names.size(); i1++) {
//                if (names.get(i).equals(names.get(i1))) {
//                    names.remove(i);
//                }
//            }
//        }

        System.out.println(names2);
    }
}
/*
Write a Java program that removes duplicate elements from an ArrayList of strings.
You can initialize the ArrayList manually.
 */