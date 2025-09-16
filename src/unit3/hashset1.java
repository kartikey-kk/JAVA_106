package unit3;

import java.util.HashSet;
import java.util.Scanner;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of element in hs1");
        int m = sc.nextInt();
        System.out.println("Enter the no. of element in hs2");
        int n= sc.nextInt();

        System.out.println("Enter the element in hs1");
        for(int i=0; i<m; i++)
        {
            hs1.add(sc.next());
        }
        System.out.println(hs1);

        for(int i=0; i<n; i++)
        {
            hs2.add(sc.next());
        }
        System.out.println(hs2);


        System.out.println("Union of both");
        hs1.addAll(hs2);
        System.out.println(hs1);


        System.out.println("Intersection of both");
        hs1.remove(hs2);
        hs2.addAll(hs1);
        System.out.println(hs2);
    }
}
