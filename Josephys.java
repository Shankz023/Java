import java.util.Scanner;
class Node{
	int reach;
	Node nextNode;
	int n;

	Node(int n)
	{
		this.n=n;
		this.reach=0;
		this.nextNode=null;
	}
}
class Josephys
{
	Scanner sc=new Scanner(System.in);
	Node head=null;
	Node tail=null;
	int m,k,n;
	void numberOfPeoples()
	{
		System.out.println("Enter number Of Peoples: ");
		n=sc.nextInt();
		System.out.println("Enter interval at which People has to be killed : ");
		k=sc.nextInt();
		System.out.println("Enter number Of Peoples Saved: ");
		m=sc.nextInt();
		
	}
	void input()
	{
		for (int i=0;i<n;i++) {
			Node x=new Node(i+1);
			if(head==null)
			{
				head=x;
				//head2=head;
				//System.out.println("input: "+head.n);
			}
			else{
				tail.nextNode=x;	
			}
			tail=x;
			tail.nextNode=head;
		}
		//root=head;
	}

	void printList(Node head2)
	{
		int i=0;
		while(i<=n)
		{
			System.out.println(head2.n);
			head2=head2.nextNode;
			i++;
		}
	}

	public static void main(String[] args) {

	Josephys j=new	Josephys();
	j.numberOfPeoples();
	j.input();
	//j.head=j.circular(j.head);
	j.printList(j.head);
	}
}