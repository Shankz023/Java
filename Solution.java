import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Solution {
    static int[][] turnLeft(int[][] ab)
    {
        int[][] a=new int [3][3];
        int i,j,k=0;
        for(i=2;i>=0;i--)
        {
            for(j=0;j<=2;j++)
            {
                a[k][j]=ab[j][i];
            }
            k++;
        }
        k=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return a;
    }
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int[][] original={{4,9,2},{3,5,7},{8,1,6}};
        int i,j,k=1,el=0;
        int[] error=new int[4];
        while(k<=4)
        {
            original=turnLeft(original);
            i=0;
            for(int[] x:original)
            {
                j=0;
                for(int x1:x)
                { 
                    
                    if(x1!=s[i][j])
                    {
                        System.out.print("x1: "+x1+"s["+i+"]["+j+"]: "+s[i][j]);
                        System.out.println(original[i][j]);
                        if(x1>s[i][j])
                            error[el]+=(x1-s[i][j]);
                       else
                            error[el]+=(s[i][j]-x1);
                    }
                    j++;
                }
                i++;
            }
            k++;
            el++;
            i=0;
        }
        int min=9999;
        for(int x: error)
        {
            if(x<min)
            min=x;
            System.out.println(x);
        }
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j]=sc.nextInt();
            }
        }

        int result = formingMagicSquare(s);
        System.out.println(result);
    }
}
