package j6;

import java.util.LinkedList;
import java.util.List;


public class J6Class {

    public static void printList() {

        // Java 6: no type inference
        List<String> list = new LinkedList<String>();
        list.add("foo");
        list.add("bar");
        list.add("xur");

        System.out.println("Java 6 Output:");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println();

    }

}
