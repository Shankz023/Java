import java.util.Scanner;
class Krushkal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of vertices");
    n=sc.nextInt();
    int mat[][]=new int[n][n];
    int i,j,start,ch;
    boolean[] b=new boolean[n];
    int[] path=new int[n];
    int[] cost=new int[n];
    System.out.println("Enter 1 to Enter edges");
    ch=sc.nextInt();
    for(i=0;i<n;i++)
    {
      b[i]=false;
      path[i]=-1;
      cost[i]=9999999;
      for(j=0;j<n;j++)
      {
        if(i==j)
        continue;
        else
        mat[i][j]=99999;
      }
    }
    int count=0;
    while(ch==1)
    {
      System.out.println("Enter start and end vertex");
      i=sc.nextInt();
      j=sc.nextInt();
      System.out.println("Enter weight");
      mat[i][j]=sc.nextInt();
      mat[j][i]=mat[i][j];
      count++;
      System.out.println("Enter 1 to Enter edges");
      ch=sc.nextInt();
    }
    int[] edges=new int[count];
    int[] edge_V=new int[count];
    for(i=0;i<n;i++)
    {
    	for(j=i+1;j<n;j++)
    	{
    		if(mat[i][j]!=9999999)
    		{
    			edges[i]=(i*10)+j;
    			edge_V[i]=mat[i][j];
    		}
    	}
    }
    Krushkal k=new Krushkal();
    k.Sort();
	}

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
}