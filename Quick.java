import java.util.Scanner;
class Quick
{

	void printArray(int[] a)
	{
		System.out.println();
		for(int x1 : a)
			System.out.println(x1);
	}

	void swap(int x,int y)
	{
		int t=x;
		x=y;
		y=t;
	}

	int partition(int[] a,int p,int r)
	{
		int x=a[r];
		int i=p-1,t;
		for(int j=p;j<r;j++)
		{
			if(a[j]<=x)
				{
					i=i+1;
					t=a[i];
					
				
					a[i]=a[j];
					a[j]=t;
					printArray(a);
				}
				//swap(a[i+1],a[r]);
				}
				t=a[i+1];
				System.out.println(i+1);
					a[i+1]=a[r];
					a[r]=t;
		
		return i+1;
	}

	void sort(int[] a,int p,int r)
	{
		if (p<r)
			{
				int q=partition(a,p,r);
				sort(a,p,q-1);
				sort(a,q+1,r);
			}
	} 


	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		Quick ms=new Quick();
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements of array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//ms.printArray(arr);
		ms.sort(arr,0,n-1);
		ms.printArray(arr);
	}
}