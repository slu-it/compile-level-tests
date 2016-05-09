package j8;

import java.util.LinkedList;
import java.util.List;


public class J8Class {

    public static void printList() {

        // Java 7: type inference
        List<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("xur");

        // Java 8: method references
        System.out.println("Java 8 Output:");
        list.forEach(System.out::println);
        System.out.println();

    }

}
