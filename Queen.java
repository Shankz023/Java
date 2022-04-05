import java.util.Scanner;
class Queen
{
	boolean isSafe(int [][]a,int row,int col,int n)
	{
		int i,j;
		for(i=0;i<col;i++)
		{
			if(a[row][i]==1)
				return false;
		}
		for(i=row,j=col;i<n&&j>=0;i++,j--)
		{
			if(a[i][j]==1)
				return false;
		}
		for(i=row,j=col;i>=0&&j>=0;i--,j--)
		{
			if(a[i][j]==1)
				return false;
		}
		return true;
	}

	boolean placeQ(int[][] a,int col,int n,int k)
	{
		if(col>=n)
			return true;
		for(int i=k;i<n;i++)
		if(isSafe(a,i,col,n)==true)
		{
			a[i][col]=1;
			if(placeQ(a,col+1,n,0)==true)
				return true;
			a[i][col]=0;
		}
		return false;
	}

	public static void main(String[] args)
	{
		Queen qu=new Queen();
		int n=8;
		Scanner sc=new Scanner(System.in);
		System.out.println("Minimum number of Queens must be 4");
		n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=0;
		
		
		int k=0;

		while(k<n)
		{
			boolean b=qu.placeQ(a,0,n,k);
			if(b==true)
			{
				
				for(int i=0;i<n;i++)
					{
						for(int j=0;j<n;j++)
							System.out.print(a[i][j]);
						System.out.println();
					}
				}
				k=k+2;

			System.out.println();
			System.out.println();
			for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=0;
		}
	}
}