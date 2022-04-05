import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Prime prim=new Prime();
		prim.checkP(n);
	}
	void checkP(int n)
	{
		int k=(int)Math.sqrt(n);
		int[] a=new int[n];
		for(int i=2;i<=k;i+=2)
			a[i]=2;
		for(int i=3;i<=k;i=i+2)
		{
			if(a[i]==0)
			{
				a[i]=i;
			for(int j=i;(i*j)<=k;j++)
				a[i*j]=i;
		}
		}
		int i=2;
		boolean y=false;
		while(a[i]!=0)
		{
			if(n%a[i]==0)
			{
				y=true;
				System.out.println("Not a Prime Number");
				break;
			}
			i++;
		}
		if(y==false)
		{
			System.out.println("Prime Number");
		}
		//System.out.println(k);
	}
}