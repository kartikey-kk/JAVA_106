package unit1;

public class Calculator {
    double ar;

    // method over loading
    public void Area(double l, double b)
    {
        ar=l*b;
        System.out.println("ARea of rectangle "+ ar);
    }

    public void Area(double r)
    {
        ar=Math.PI*r*r;
        System.out.println("ARea of rectangle "+ ar);
    }

    public void Area(double l, double b, double h)

    {
        ar=2*(l*b + b*h + h*l);
        System.out.println("ARea of rectangle "+ ar);
    }

}
