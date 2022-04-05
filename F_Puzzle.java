import java.util.Scanner;
class F_Puzzle
{
	void prin(int a)
	{
		System.out.println(a);
	}
	int[][] moveRight(int[][] a,int r,int c)
	{
		int i=r,j=c;
		int swap;
		swap=a[r][c];
		a[r][c]=a[r][c+1];
		a[r][c+1]=swap;

		return a;
	}
	int[][] moveLeft(int[][] a,int r,int c)
	{
		int i=r,j=c;
		int swap;
		swap=a[r][c];
		a[r][c]=a[r][c-1];
		a[r][c-1]=swap;

		return a;
	}
	int[][] moveUp(int[][] a,int r,int c)
	{
		int i=r,j=c;
		int swap;
		swap=a[r][c];
		a[r][c]=a[r-1][c];
		a[r-1][c]=swap;

		return a;
	}
	int[][] moveDown(int[][] a,int r,int c)
	{
		int i=r,j=c;
		int swap;
		swap=a[r][c];
		a[r][c]=a[r+1][c];
		a[r+1][c]=swap;

		return a;
	}

		int getError(int[][] a)
	{
		int out[][]=new int[4][4];
		int k=0,er=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				out[i][j]=++k;
			}
		}
		out[3][3]=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(a[i][j]!=out[i][j])
					er++;

			}
		}
		//printArray(a);
		if(er==0)
		{
			printArray(a);
		System.out.println("Done...Yay");
		System.exit(0);
	}
		/*//System.out.println(er);
		//return er;*/
		return er;
	}

	void branNB(int[][] inp,int[][] ou)
	{
		int pos_r=9,pos_c=9,pos0,ue=9,le=9,de=9,re=9;
		int[][] left=new int[4][4];
		int[][] right=new int[4][4];
		int[][] up=new int[4][4];
		int[][] down=new int[4][4];

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				left[i][j]=inp[i][j];
				right[i][j]=inp[i][j];
				up[i][j]=inp[i][j];
				down[i][j]=inp[i][j];
				if(inp[i][j]==0)
				{
					pos_r=i;
					pos_c=j;
				}
			}
		}
		
		if(pos_c==0)
		{
			if(pos_r==3)
			{
			 ue=getError(moveUp(up,pos_r,pos_c));
			//int de=getError(moveDown(down));
			 re=getError(moveRight(right,pos_r,pos_c));
			}
			if(pos_r==0)
			{
				re=getError(moveRight(right,pos_r,pos_c));
				de=getError(moveDown(down,pos_r,pos_c));
			}
			if(pos_r>0&&pos_r<3)
			{
				 ue=getError(moveUp(up,pos_r,pos_c));
				 de=getError(moveDown(down,pos_r,pos_c));
			     re=getError(moveRight(right,pos_r,pos_c));
			     //System.exit(0);
			}
		}
		if(pos_c==3)
		{
			if(pos_r==0)
			{
			//int ue=getError(moveUp(up));
			de=getError(moveDown(down,pos_r,pos_c));
			le=getError(moveLeft(left,pos_r,pos_c));
			}
			if(pos_r>0&&pos_r<3)
			{
				le=getError(moveLeft(left,pos_r,pos_c));
				ue=getError(moveUp(up,pos_r,pos_c));
				de=getError(moveDown(down,pos_r,pos_c));
				//System.exit(0);
			}
			if(pos_r==3)
			{
				le=getError(moveLeft(left,pos_r,pos_c));
				ue=getError(moveUp(up,pos_r,pos_c));
			}
		}
		if(pos_c>0&&pos_c<3)
		{
			if(pos_r==0)
			{
			     de=getError(moveDown(down,pos_r,pos_c));
			     re=getError(moveRight(right,pos_r,pos_c));
			     le=getError(moveLeft(left,pos_r,pos_c));
			}
			if(pos_r>0&&pos_r<3)
			{
				 le=getError(moveLeft(left,pos_r,pos_c));
				 ue=getError(moveUp(up,pos_r,pos_c));
				 de=getError(moveDown(down,pos_r,pos_c));
			     re=getError(moveRight(right,pos_r,pos_c));
			}
			if(pos_r==3)
			{
				 ue=getError(moveUp(up,pos_r,pos_c));
				 re=getError(moveRight(right,pos_r,pos_c));
			     re=getError(moveLeft(left,pos_r,pos_c));
			}

		}
		if(le<re&&le<de&&le<ue&&le!=0)
		{
			branNB(left,ou);
		}
		if(re<le&&re<de&&re<ue&&re!=0)
		{
			//right=moveRight(inp,pos_r,pos_c);
			//printArray(right);
			branNB(right,ou);
		}
		if(ue<le&&ue<de&&ue<re&&ue!=0)
		{
			branNB(up,ou);
		}
		if(de<le&&de<ue&&de<re&&de!=0)
		{
			branNB(down,ou);
		}
		//if(le==0||de==0||re==0||ue==0)
		//{
			//System.out.println("Yay!Solution Found");
			if(le==0)
			{
				printArray(left);
			}
			if(re==0)
			{
				printArray(right);
			}
			if(de==0)
			{
				printArray(down);
			}
			if(ue==0)
			{
				printArray(up);
			}
		//}
	}

	


	void printArray(int[][] a)
	{
		for(int[] x1:a)
		{
			for(int x:x1)
				System.out.print(x);
			System.out.println();

		}
		System.out.println();
		//System.exit(0);
	}
	public static void main(String[] args)
	{
		int input[][]=new int[4][4];
		int out[][]=new int[4][4];
		int k=0;
		Scanner sc=new Scanner(System.in);
		F_Puzzle fpuz=new F_Puzzle();
		System.out.println("Enter values in 15 puzzle game to be solved");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				input[i][j]=sc.nextInt();
				out[i][j]=++k;
			}
		}
		out[2][2]=0;
		fpuz.branNB(input,out);
	}
}