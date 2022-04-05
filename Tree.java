import java.util.Scanner;
class Node{
	int n,color,special=0;
	Node left;
	Node right;
	Node(int n)
	{
		this.n=n;
		this.color=0;
		left=null;
		right=null;
	}
	int get_num()
	{
		return n;
	}
}
class Tree
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of Nodes: ");
		int n_nodes=sc.nextInt();
		Node[] ob=new Node[n_nodes];
		for (int i=0;i<n_nodes ;i++ ) {
			Node s=new Node(i+1);
			ob[i]=s;
		}
		for(int i=0;i<n_nodes ;i++ )
		{
			Node s=ob[i];
			System.out.print(s.get_num()+" ");
		}
		int u,v;
		for (int i=0;i<n_nodes-1 ; i++) {
		System.out.println("Enter Start and End Vertex:");
		u=sc.nextInt();
		v=sc.nextInt();
		if(ob[u-1].left==null)
		ob[u-1].left=ob[v-1];
		else if(ob[u-1].left!=null&&ob[u-1].right==null)
		ob[u-1].right=ob[v-1];
		else
		System.out.print("No Space");	
		}
		int nc;
		System.out.print("Input Colors:\n");
		for(int i=0;i<n_nodes ;i++ )
		{
			ob[i].color=sc.nextInt();
		}
		int count=0;
		System.out.println("Enter number of queries: ");
		nc=sc.nextInt();
		for (int i=0;i<nc ;i++ ) {
			int q=sc.nextInt();
			q=q-1;
			if(ob[q].special!=1)
			{
				ob[q].special=1;
				count++;
				while(ob[q].left!=null) {
					q=ob[q].left.n;
					ob[q].special=1;
					count++;
				}
				while(ob[q].right!=null) {
					q=ob[q].right.n;
					ob[q].special=1;
					count++;
				}
				System.out.println("  "+count);
			}
			else
				System.out.println("  "+count);
		}
	}
}