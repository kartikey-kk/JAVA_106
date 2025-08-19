public class MyMain {
    public static void main(String[] args) {

        Student s1 = new Student(12,"Kartikey");
       Student s2 = new Student(s1);
       // Student s2=s1; // passing reference both will change if change occur in any of them, but not in cpp its copy data.

//        s1.name="Kartikey kumar";
//        s1.roll_no=33;
//        s1.display();
//        s1.name = "Abhishek";
//        s2.display();
    }
}
