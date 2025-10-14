package unit2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFilterProducts {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1 ,"HP1", 120000));
        productList.add(new Product(2 ,"HP2", 110000));
        productList.add(new Product(3 ,"HP3", 1210000));
        productList.add(new Product(4 ,"HP4", 178000));
        productList.add(new Product(5 ,"HP5", 4845000));
        productList.add(new Product(6 ,"HP6", 151500));


        List<Double> newlist = productList.stream()
                .filter(p->p.price>120000)
                .map(p->p.price)
                .collect(Collectors.toList());

        System.out.println(newlist);

    }
}
