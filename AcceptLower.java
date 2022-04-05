import java.util.*;
class AcceptLower
{
	
	
	void firstLetterCap()
	{
		String s,ss,w;
		w="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string in lower case: ");
		s=sc.nextLine();
		ss=" "+s;
		int l=ss.length();
		for(int i=0;i<l;i++)
		{
			String c;
			if(ss.charAt(i)==' ')
			{
				w=w+ss.charAt(i)+Character.toUpperCase(ss.charAt(i+1));
				i+=1;
			}
			else
			{
				w=w+ss.charAt(i);
			}
		}
		System.out.println(w.substring(1));
	}

	public static void main(String[] args)
	{

		AcceptLower al=new AcceptLower();
		al.firstLetterCap();
	}
}