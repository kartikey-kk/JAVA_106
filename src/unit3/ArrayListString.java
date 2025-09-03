package unit3;

import java.util.*;

import static java.util.Collection.*;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> prod = new ArrayList<>();

        System.out.println("Enter the number of product");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<=n; i++)
        {
            prod.add(sc.nextLine());
        }

        Collections.sort(prod);

        Iterator it = prod.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        prod.add(1, "Apple");
        prod.addLast("Banana");
        prod.addFirst(prod.get(1));


    }
}
