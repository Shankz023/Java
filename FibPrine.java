import java.util.*;
class FibPrine
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=Integer.parseInt(sc.next());
if(n==1){
System.out.println("It is 1");
System.exit(0);
}
if(n==0){
System.out.println("Invalid Input");
System.exit(0);
}
int a=0,b=1,c=0;
int prime=1;
for(int i=1;i<=n;i++){
c=a+b;
a=b;
b=c;
if(checkPrime(c)){
if(prime<c){
prime=c;
}
}
}
System.out.println("It is "+prime);

}
public static boolean checkPrime(int c){
	int sqt=(int)Math.sqrt(c);
	for(int i=2;i<=sqt;i++){
		if(c%i==0){
			return false;
		}
	}
	return true;
}
}