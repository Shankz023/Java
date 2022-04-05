import java.util.Scanner;
class Group{
public static void main(String[] args) {
	int n,g;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	g=sc.nextInt();
	System.out.println("Enter numbers\n");
	int i;
	int[] arr=new int[n];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	Group obj=new Group();
	obj.makeFroup(arr,n,g);
}
void makeFroup(int[] arr,int n,int g)
{
	int maxEle=n-g+1;

	int[] ele=new int[maxEle];
	for (int i=0;i<maxEle;i++) {
		ele[i]=min(arr);
	}
	System.out.print("Group1: ");
	for (int i=0;i<maxEle;i++) {
		System.out.print(ele[i]);
	}
	System.out.println();
	for (int i=0;i<n;i++) {
		if(arr[i]!=9999999)
			System.out.println(arr[i]);
	}
}
int min(int[] arr)
{
	int i,len,min=999999,pos=0;
	len=arr.length;
	for(i=0;i<len;i++)
	{
		if(arr[i]<min)
			{
				min=arr[i];
				pos=i;
			}
	}System.out.print(min+" ");
	arr[pos]=9999999;
	return min;
}
}