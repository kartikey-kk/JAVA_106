import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException2 {
    public static void main(String[] args) throws IOException {
        int x,y,z=0;
        DataInputStream dis =new DataInputStream(System.in);
        //Scanner sc = new Scanner(System.in);

//            x=sc.nextInt();
//            y=sc.nextInt();
            x = dis.readInt();
            y = dis.readInt();

            z=x/y;
            System.out.println("Exception Not Occur");


    }
}