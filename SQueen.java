package nqueen;
public class SQueen
{
	public boolean isNotSafe(int[][] a,int posi,int posj)
	{
		System.out.println(posi+" "+posj);
		int i=0,j=0;
		//for updown
			for(j=posj+1;j<8;j++)
				{
					if(a[posi][j]==1)
					{
						System.out.println("true1");
						return true;
					}
				}
				for(i=posi+1;i<8;i++)
				{
					if(a[i][posj]==1)
					{
						//System.out.println("true1");
						return true;
					}
				}
			for(i=posi-1;i>=0;i--)
				{
					if(a[i][posj]==1)
					{
						System.out.println("true2");
						return true;
					}
				}
		
			for(j=posj-1;j>=0;j--)
				{
					if(a[posi][j]==1)
					{
						System.out.println("true2");
						return true;
					}
				}

		//now checking diagonals
		i=posi-1;
		j=posj-1;
		while(i>=0&&j>=0)
		{
			if(a[i][j]==1)
			{
				System.out.println("true3");
						return true;
					}
			i--;
			j--;
		}
		i=posi+1;
		j=posj+1;
		while(i<8&&j<8)
		{
			if(a[i][j]==1)
			{
						System.out.println("true4");
						return true;
					}
			i++;
			j++;
		}
		i=posi-1;
		j=posj+1;
		while(i>=0&&j<8)
		{
			if(a[i][j]==1)
			{
				System.out.println("true5");
						return true;
					}
			i--;
			j++;
		}
		i=posi+1;
		j=posj-1;
		while(i<8&&j>=0)
		{
			if(a[i][j]==1||a[j][i]==1)
			{
				System.out.println("true6");
						return true;
					}
			i++;
			j--;
		}
		return false;
	}
}