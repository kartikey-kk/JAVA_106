package unit3;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("One");
        lhs.add("two");
        lhs.add("three");
        lhs.add("three");

        System.out.println(lhs);

    }
}
