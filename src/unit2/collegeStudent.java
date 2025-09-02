package unit2;

public class collegeStudent extends Student1 {

    public  collegeStudent(String name, int roll_no){
        super(name,roll_no);
    }

    public void attend_class(){
        System.out.println(name+" Attend class on Smart Board");
    }

    public void give_exam(){
        System.out.println(roll_no+" Give exam in online mode");
    }
}
