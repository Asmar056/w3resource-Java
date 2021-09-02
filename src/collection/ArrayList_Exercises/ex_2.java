package collection.ArrayList_Exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(65);
        list.add(658);
        list.add(89);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
