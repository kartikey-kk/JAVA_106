package unit3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        // Passing objects
        al.add(new Student(20,"Abhi",100));
        al.add(new Student(96,"katu",101));
        al.add(new Student(92,"Ravi",102));
        al.add(new Student(56,"Raju",103));
        al.add(new Student(85,"Devansh",104));

        Collections.sort(al);

        for(Student st: al)
        {
            System.out.println("Name "+st.name+" Age "+st.age+" Roll_no "+ st.roll_no);
        }


    }
}
