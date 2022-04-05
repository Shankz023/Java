import java.util.*;
class SmaInt{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Double m=(double)n;
		String s="";
		for (int i=2;i<=n;i++) {
			if(n%i==0){
				s+=i;
				n=n/i;
				i-=1;
				//System.out.println(i+1);
			}
		}
		//System.out.println(s);
		String val="";
		for (int i=0;i<s.length()-1;i++) {
			char c=s.charAt(i);
			int p=(Integer.parseInt(s.substring(i,i+1)));
			c=s.charAt(i+1);
			int y=Integer.parseInt(s.substring(i+1,i+2));
			if((p*y)>9){
				val=val+p;
			}
			else{
				val+=(p*y);
				i++;
			}
		}
		val=val+s.substring(s.length()-1,s.length());
		int num=Integer.parseInt(val);
		int rev=getRev(val);
		if(num>rev){
			num=rev;
		}
		if(getmultiple(num)==m){
			System.out.println(num);
		}
		else{
			System.out.println("Not Possible");
		}

	}
	static int getRev(String s){
		int p=Integer.parseInt(s);
		int rev=0;
		while(p!=0){
			rev=rev*10+(p%10);
			p=p/10;
		}
		return rev;
	}
	static int getmultiple(int num){
		int t=1;
		while(num!=0){
			int r=num%10;
			t=t*r;
			num=num/10;
		}
		return t;
	}
}