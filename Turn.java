class Turn
{
	public static void main(String[] args) {
		int a[][]={{0,0,1,0,0},{0,0,1,0,0},{1,1,1,1,1},{0,0,1,0,0},{0,0,1,0,0}};
		printArray(a);
		trun_forty_five(a);
		
	}
	static void printArray(int[][] a)
	{
		for(int x1[]:a)
		{
			for(int x:x1)
				System.out.print(x);
			System.out.println();
		}
	}
	static void trun_forty_five(int[][] a)
	{
		int[][] b=new int[5][5];
		int i=0,j=0,k=0,l=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if((i)>2)
				{
					k=(i)-4;
				}
				else
					k=i;
				if((j)>2)
				{
					l=(j)-4;
				}
				else
					l=j;
				b[k+2][l+2]=a[i][j];
			}
		}
		printArray(b);
	}
}