package collection.ArrayList_Exercises;

import java.util.ArrayList;
import java.util.List;

public class ex_3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add(0,"I am Asmar");

        System.out.println(list);
    }
}
