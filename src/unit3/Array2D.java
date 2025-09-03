package unit3;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] a = new int [2][3];
        int[][] b = new int [2][3];
        int[][] c = new int [2][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<b[i].length; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        // add
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        //print
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<c[i].length; j++)
            {
                System.out.print(c[i][j]+" ");

            }
        }
    }
}
