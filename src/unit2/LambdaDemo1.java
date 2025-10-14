package unit2;

public class LambdaDemo1 {
    public static void main(String[] args) {
        NumericTest isEven = (int n)-> n%2==0;
        System.out.println(isEven.test(12));

    }
}
