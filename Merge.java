import java.util.Scanner;
class Merge
{
	void merge(int[] a,int f,int m,int l)
	{
		int[] a1=new int[m-f+1];
		int c=0,p=0,i=0,t=f;
		
		//int[] b=new int[l];
		int[] a2=new int[l-m];
		int k=0;
		for(i=0;i<(m-f+1);i++)
			{
					a1[c++]=a[f+i];
			}
			for(i=0;i<(l-m);i++)
			{
					a2[k++]=a[m+1+i];
			}
			
		c=0;
		while(c<(m-f+1) && p<(l-m))
		{
			if(a1[c]<=a2[p])
				a[t]=a1[c++];
			else if(a1[c]>a2[p])
				a[t]=a2[p++];
			t++;

		}
		while(c<(m-f+1))
			a[t++]=a1[c++];
		while(p<(l-m))
			a[t++]=a2[p++];
	}
	void sort(int[] a,int f,int l)
	{
		int m=(f+l)/2;
		if(f<l)
		{
			sort(a,f,m);
			sort(a,m+1,l);
			merge(a,f,m,l);
		}
	}
	int removeDuplicate(int[] a,int[] b,int n)
	{
		int i,k=0,l;
		l=a[0];
		b[0]=l;
		for(i=1;i<n;i++)
		{
			if(l==a[i])
				continue;
			else 
			{
				l=a[i];
				b[++k]=l;
			}
		}
		return k;
	}

	void printArray(int[] a)
	{
		System.out.println();
		System.out.println();
		for(int x1 : a)
			System.out.println(x1);
	}
	public static void main(String[] s)
	{
		Scanner sc = new Scanner(System.in);
		Merge ms=new Merge();
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] b=new int[n];
		System.out.println("Enter Elements of array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//ms.printArray(arr);
		ms.sort(arr,0,n-1);
		ms.printArray(arr);

		int k=ms.removeDuplicate(arr,b,n);
		System.out.println();
		for(int i=0;i<=k;i++)
			System.out.println(b[i]);
	}
}