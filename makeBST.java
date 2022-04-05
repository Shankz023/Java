import java.util.Scanner;
class Node
{
	int n;
	Node left;
	Node right;
	Node(int n)
	{
		this.n=n;
		this.left=null;
		this.right=null;
	}
}
class makeBST
{
	Node root;
	Node temp;
	int height=0;
	void maketree(int[] arr)
	{
		for(int x:arr)
		{
			Node n1=new Node(x);
			if(temp==null)
			{
				temp=n1;
				System.out.println(temp.n);
				root=temp;
				height++;
			}
			else
			{
				
				temp=putInPlace(temp,n1);
				//System.out.println(temp.n);
				/*while(temp.n>=n1.n)
				{
					if(temp.left==null)
						temp.left=n1;
					else
					{
						temp=temp.left;
						System.out.println(temp.n);
					}
				}
				while(temp.n<n1.n)
				{
					if(temp.right!=null)
						temp=temp.right;
					else
					{
						temp.right=n1;
						System.out.println(temp.n);
					}
				}
				//putInPlace(root,n1);*/
			}
		}
		System.out.println("HEIGHT "+height);
	}
	Node putInPlace(Node k,Node x)
	{
		if(k==null)
		{
			k=new Node(x.n);
			System.out.print(k.n);
			return k;
		}
		else
		{
			if(k.n>=x.n)
			{
				if(k.left==null&&k.right==null)
				{
					height++;
				}
				k.left=putInPlace(k.left,x);
			}
			else
			{
				if(k.left==null&&k.right==null)
				{
					height++;
				}
				k.right=putInPlace(k.right,x);

			}
		}
		
		return k;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of inputs\n");
		int len=sc.nextInt();
		int[] arr=new int[len];
		for (int i=0;i<len ;i++ ) {
			arr[i]=sc.nextInt();
		}
		makeBST mb=new makeBST();
		mb.maketree(arr);
	}
}