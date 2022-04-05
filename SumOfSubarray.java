import java.util.*;
class SumOfSubarray
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of array");
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		SumOfSubarray sb=new SumOfSubarray();
		sb.getMax(a,n);
	}
	void getMax(int[] a,int n)
	{
		String w="";
		int max=-1,max2=-1,sum=0;
		int pos1=0,pos2=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			if(sum>=0)
			{
			if(max2<sum)
			{
				
				max2=sum;
				pos2=i;
			}
		}
		else
		{
			sum=0;
			//sum=sum+a[i];
		}
		}
		max=max2;
		while(max!=0)
		{
			System.out.println(a[pos2]);
			max=max-a[pos2];
			pos2--;
		}
		System.out.println("Max is: "+w+" "+max2);
	}
}