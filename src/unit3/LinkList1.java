package unit3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<String> ll=  new LinkedList<>();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");
        ll.add("Forth");

        Iterator itr = ll.descendingIterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        ll.remove("Third");
        ll.addFirst("Zero");
        ll.addLast("Fifth");

        System.out.println(ll);

    }
}
