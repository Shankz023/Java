import java.util.Scanner;
import static java.lang.System.out;
class TurnRight
{
	int[][] turnRight(int[][] arr)
	{
		int[][] a=new int [3][3];
		int i,j,k=0;
		for(i=2;i>=0;i--)
		{
			for(j=0;j<=2;j++)
			{
				a[k][j]=arr[j][i];
			}
			k++;
		}
		k=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			out.println();
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr2=new int[3][3];
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		TurnRight tr=new TurnRight();

		arr2=tr.turnRight(arr);
		arr2=tr.turnRight(arr2);
	}
}