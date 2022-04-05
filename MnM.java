import java.util.Scanner;
class MnM
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of matrix to be multiplied");
		n=sc.nextInt();
		int[] a=new int[n+1];
		int[][] b=new int[n+1][n+1];
		System.out.println("Enter dimensions");
		for(int i=0;i<n+1;i++)
			a[i]=sc.nextInt();
		MnM mm=new MnM();
		
		//mm.printArray(b);
		mm.mCalculate(b,n+1,a);
	}

	void mCalculate(int[][] mat,int n,int[] a)
	{
		int min=2147483640;
		int i=2;
		int j;
		int k,q,l;
		for(i=2;i<n;i++)
		{
			for(l=1;l<n-i+1;l++)
			{
				j=i+l-1;
				mat[l][j]=min;
				for(k=l;k<j;k++)
				{
					q=mat[l][k]+mat[k+1][j]+a[l-1]*a[k]*a[j];
					if(q<mat[l][j])
					{
						mat[l][j]=q;
					}
				}
			}
		}
	printArray(mat);
	}

		void printN(int n)
	{
		System.out.println(n);
	}
	void printArray(int[][] b)
	{
		for(int x1[]:b)
		{
			for(int x: x1)
				System.out.print(x+" ");
			System.out.println();
		}
	}
}