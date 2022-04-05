import java.util.Scanner;
class Search
{
	int[] a=new int[1000];
	void initialize()
	{
		for(int i=0;i<1000;i++)
			a[i]=2147483640;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c;
		int i=0;
		System.out.println("Enter Y to enter number");
		Search s=new Search();
		String sa=sc.next();
		c=sa.charAt(0);
		
		s.initialize();
		while(c=='Y')
		{
			s.a[i++]=sc.nextInt();
			System.out.println("Enter Y to continue");
			sa=sc.next();
		    c=sa.charAt(0);
		}
		System.out.println("Enter element to be searched");
		int b=sc.nextInt();
		s.searchElement(b);
	}

	void searchElement(int b)
	{
		int low=0,high=1,pos;
		while(low<high)
		{
			if(a[high]==b)
			{
				System.out.println("Found at position :"+high);
				break;
			}
			if(a[high]<b)
			{
				low=high;
			high=high*2;
		}
		if(a[high]>b)
		{
			binarySearch(a,low,high,b);
			break;
		}
	}
}
void binarySearch(int[] a,int low,int high,int b)
{
	int mid;int c=0;
	while(low<=high)
	{
		mid=low+high/2;
		if(a[mid]==b)
		{
			System.out.println("Found at position :"+mid+1);
			c++;
			break;
		}
		if(a[mid]>b)
		{
			high=mid-1;
		}
		if(a[mid]<b)
		{
			low=mid+1;
		}
	}
	if(c==0)
		System.out.println("Not Found");
}
}