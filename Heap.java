import java.util.Scanner;
class Heap
{
	void heapify(int[] a,int n,int p)
	{
		int largest=p;
		int l=2*p+1;
		int r=2*p+2;

		if(l<n && a[l]>a[largest])
			largest=l;

		if(r<n && a[r]>a[largest])
			largest=r;

		if(largest!=p)
		{
			int swap=a[p];
			a[p]=a[largest];
			a[largest]=swap;
			heapify(a,n,largest);
		}
	}

	void sort(int[] a,int n)
	{
		int m=a.length;
		int i;
		
		for(i=(m/2)-1;i>=0;i--)
		{
			heapify(a,m,i);
		}
		
		for(i=m-1;i>=0;i--)
		{
			int swap=a[0];
			a[0]=a[i];
			a[i]=swap;
			heapify(a,i,0);
		}
	}

	void printArray(int[] a)
	{
		System.out.println("The sorted array is \n");
		for(int x1: a)
			System.out.println(x1);
	}
	public static void main(String[] args)
	{
		Heap hp=new Heap();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter numbers in array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();/*
			int arr[] = {12, 11, 13, 5, 6, 7}; 
        int n = arr.length; */
		hp.sort(arr,n);

		hp.printArray(arr);
	}
}