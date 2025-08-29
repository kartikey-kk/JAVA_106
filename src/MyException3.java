public class MyException3 {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();

        try {
            udf.validate(12);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
