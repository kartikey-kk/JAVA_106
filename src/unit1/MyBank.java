package unit1;

public class MyBank {
    public static void main(String[] args) {
        Bank b =new Bank();

        try
        {
            b.withdrawal(100000);
        }
       catch (InsufficientBalanceException e)
       {
           System.out.println(e.getMessage());
       }

    }
}
