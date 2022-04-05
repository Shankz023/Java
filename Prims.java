import java.util.Scanner;
class Prims
{
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
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
    while(ch==1)
    {
      System.out.println("Enter start and end vertex");
      i=sc.nextInt();
      j=sc.nextInt();
      System.out.println("Enter weight");
      mat[i][j]=sc.nextInt();
      mat[j][i]=mat[i][j];
      System.out.println("Enter 1 to Enter edges");
      ch=sc.nextInt();
    }
    Prims p=new Prims();
    System.out.println("Enter starting edge");
    start=sc.nextInt();

    p.primMat(mat,b,path,cost,start,n);
    p.print2D(mat);
    System.out.println();
    p.printArray(cost);
    p.printArray(path);
  }

  void primMat(int[][] mat,boolean b[],int[] path,int[] cost,int start,int n)
  {
    int i,j,pos;
    j=start;
    boolean e=false;
    cost[start]=0;
    b[start]=true;
    while(e==false)
    {
      for(i=0;i<n;i++)
      {
        if(b[i]!=true)
        {
          cost[i]=min(cost[i],mat[j][i]+cost[j]);
          //printN(cost[i]);
          path[i]=min_p(cost[i],mat[j][i]+cost[j],i,j);
        }
      }
      pos=minPos(cost,b,start,n);
      b[pos]=true;
      j=pos;
      e=check(b);
    }
  }

  int min(int m,int k)
  {
    if(m<k)
    return m;

    return k;
  }

  int min_p(int c,int m,int i,int j)
  {
    if(c<m)
    return i;

    return j;
  }

  int minPos(int[] cost,boolean[] b,int start,int n)
  {
    int min=9999,pos=0,i;
    for(i=0;i<n;i++)
    {
      if(b[i]!=true)
      {
        if(min>cost[i])
        {
          pos=i;
        min=cost[i];
      }
      }
    }
    if(min==9999)
    return start;

    return pos;
  }

  boolean check(boolean[] b)
  {
    for (boolean x:b )
    if(x!=true)
    return false;

    return true;
  }

  void print2D(int[][] mat)
  {
    for (int x1[] :mat ) {
      for (int x :x1 ) {
        System.out.print(x+" ");

      }
      System.out.println();
    }
  }

  void printArray(int[] k)
  {
    for (int x : k) {
      System.out.println(x+" ");
    }
  }

  void printN(int n)
  {
    System.out.println(n);
  }
}
