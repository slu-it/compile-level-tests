package j7;

import java.util.LinkedList;
import java.util.List;


public class J7Class {

    public static void printList() {

        // Java 7: type inference
        List<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("xur");

        System.out.println("Java 7 Output:");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println();

    }

}
