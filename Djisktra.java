import java.util.Scanner;
class Djisktra
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		int[] b=new int[n];
		boolean[] empty=new boolean[n];
		int start,end;

		System.out.println("Press 1 Enter weight between the paths for undirected graph");
		int c=sc.nextInt();
		while(c==1)
		{
		System.out.println("Enter start and end vertices of edge");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("Enter weight");
		a[i][j]=sc.nextInt();
		a[j][i]=a[i][j];

		System.out.println("Press 1 Enter weight between the paths for undirected graph");
		c=sc.nextInt();
	}
	Djisktra djisktra =new Djisktra();
	System.out.println("Enter start and end vertex");
	start=sc.nextInt();
	end=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		b[i]=999999;
		empty[i]=false;
	}
	b[start]=0;
	empty[start]=true;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
			if(a[i][j]==0)
				a[i][j]=9999999;
		for(int j=i+1;j<n;j++)
			if(a[j][i]==0)
				a[j][i]=9999999;
	}
	djisktra.display(a);
	int ou;
	ou=djisktra.shortestPaths(a,b,empty,start,end,n);
	System.out.println(ou);
	}

	int shortestPaths(int[][] a,int[] b,boolean[] empty,int start,int end,int n)
	{
		if(empty[end]==false)
		{
			for(int i=0;i<n;i++)
			{
				if(start!=i&&empty[i]==false)
				{
					b[i]=min(a[start][i]+b[start],b[i]);
				}
			}
			int t=min_ele(empty,b);
			empty[t]=true;
			//displayA(b);
			shortestPaths(a,b,empty,t,end,n);
		}
		return b[end];
	}
	int min(int a,int b)
	{
		if(a<=b)
			return a;
		else
			return b;
	}
	int min_ele(boolean[] empty,int[] a)
	{
		int min=99999;
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min&&empty[i]!=true)
				{
					min=a[i];
					pos=i;
				}
		}
		return pos;
	}
	void display(int[][] b)
	{
		for(int[] x1:b)
		{
			for(int x:x1)
				System.out.print(x+" ");
			System.out.println();
		}
	}
	void displayA(int[] x1)
	{
		for(int x:x1)
				System.out.print(x+" ");
	} 
}