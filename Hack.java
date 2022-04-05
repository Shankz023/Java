import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int wrong=0;
        if(n<6)
        {
            wrong=6-n;
        }
        int i=0;
        int low=0,up=0,dig=0,spcl=0;
        for(i=0;i<n;i++)
        {
            char c=password.charAt(i);
            int k=(int)c;
            System.out.println(k);
            if(k>=65 && k<=90)
            {
                up+=1;
            }
            if(k>=97 && k<=126)
            {
                low+=1;
            }
            if(k>=48 && k<=57)
            {
                dig+=1;
            }
            if(c=='!'||c=='@'||c=='+'||c=='-'||c=='#'||c=='%'||c=='$'||c==')'||c=='&'||c=='('||c=='*'||c=='^')
            {
                spcl+=1;
            }
        }
        System.out.println(dig);
        int num=0;
         if(low==0)
         {
            num+=1;
         }
         if(up==0)
         {
            num+=1;
        }
         if(dig==0)
         {
            num+=1;
        }
         if(spcl==0)
         {
            num+=1;
        }
        if(num>wrong)
        {
            return num;
        }
        return wrong; 

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        System.out.println(answer);
    }
}
