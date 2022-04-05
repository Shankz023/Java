import java.util.Scanner;
class SumOfPrime
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	String w="";
	SumOfPrime sp=new SumOfPrime();
	int sum=0;
	int i;
	int j=0,k=0;
	a[0]=0;
	for(i=2;i<=n;i++)
	{
		if(sp.prime(i)==true)
		{
			a[k++]=i;
		}
	}
	k=0;
	/*while(a[k]!=0)
	{
		System.out.println(a[k++]);
	}*/
	sp.sumofPrime(a,a);
}
void sumofPrime(int[]a,int[] b)
{
	int i=0,j=0,k=2;
	while(a[k]!=0)
	{
		j=j+a[k];
		if(prime(j))
		{
			System.out.println(j);
		}
	}
}
boolean prime(int i)
{
	int c=0;
	int t=(int)Math.sqrt(i);
	for(int j=2;j<=t;j++)
	{
		if(i%j==0)
			return false;
	}
		return true;
}
}