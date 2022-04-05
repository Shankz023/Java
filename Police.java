/**
* Feel free to edit this file.
* For any queries please refer to readme.md file or go to
* Settings > HELP
**/

import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    char[] arr=new char[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.next().toUpperCase().charAt(0);
    } 
    int count=0;
    int sum=0;
    TreeSet<Integer>ts=new TreeSet<>();
    for (int i=0;i<n-k;i++){
        if(arr[i]=='P'){
                for(int j=i+1;j<i+k+1;j++){
                if(arr[j]=='T'){
                    count++;
                }
                }
                if(i!=0){
                    for(int j=i-1;j>=i-k;j--){
                    if(arr[j]=='T'){
                        count++;
                    }
                    if(j==0){
                        break;
                    }
                }
            }
            sum+=count;
            ts.add(count);
            count=0;
        }
    }
    System.out.println(ts.pollLast());
  }
}
