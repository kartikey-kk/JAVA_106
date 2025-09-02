package unit2;

public class Employee {
    int id;
    String name;

    Employee(int i, String n)   // Constructor
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println("Id "+id+" Name "+name);
    }
}
