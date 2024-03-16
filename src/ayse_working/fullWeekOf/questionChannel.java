package ayse_working.fullWeekOf;

import java.util.HashMap;
import java.util.Map;

public class questionChannel {
    public static void main(String[] args) {

            Map<Integer, String > employees = new HashMap<>();

            employees.put(123,"John");
            employees.put(213,"Tom");
            employees.put(423,"George");
            employees.put(243,"Peter");
            employees.put(143,"Mustafa");
            employees.put(573,"Ahmed");

            System.out.println(employees);

            Map<Integer, String> map = new HashMap<>(employees);

            System.out.println(map);

            System.out.println(map.equals(employees));
            //In video 42 Muhtar said that the equals(); method would give me false because the order matters
            // but when running this code I'm only getting true, why does it happen?
            // The HashMap should not keep insertion order or ascending order so how come it works?

        }

}
