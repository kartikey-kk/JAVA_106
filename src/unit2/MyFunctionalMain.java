package unit2;

public class MyFunctionalMain {
    public static void main(String[] args) {
        //MethodReference methodReference = new MethodReference();
        Sayable sayable = MethodReference::saySomething;
        sayable.say();
    }
}
