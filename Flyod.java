import java.util.Scanner;
class Flyod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int n=sc.nextInt();
		int[][] a=new int[n][n];

		System.out.println("Press 1 Enter weight between the paths for undirected graph");
		int c=sc.nextInt();
		while(c==1)
		{
		System.out.println("Enter start and end vertices of edge");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("Enter weight");
		a[i][j]=sc.nextInt();

		System.out.println("Press 1 Enter weight between the paths for undirected graph");
		c=sc.nextInt();
	}
	Flyod flyod =new Flyod();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
			if(a[i][j]==0)
				a[i][j]=9999999;
	}
	flyod.shortestPaths(a,n);

	}

	void shortestPaths(int[][] a,int n)
	{
		int[][] b=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			b[i][j]=a[i][j];
		display(b);
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					if(b[j][k]>b[j][i]+b[i][k])
					b[j][k]=b[j][i]+b[i][k];
				}
			}
		display(b);
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
}