import java.util.*;
class Tour{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<Character,Integer> mp=new HashMap<>();

		int n=sc.nextInt();
		sc.nextLine();
		while(sc.hasNextLine()){
			String[] s=sc.nextLine().split(" ");
			if(s[0].length()!=0){
				String[] w=s[2].split("-");
			char c1=s[0].charAt(0);
			char c2=s[1].charAt(0);
			int v1=Integer.parseInt(w[0]);
			int v2=Integer.parseInt(w[1]);
			if(v1>v2){
				mp.put(c1,mp.containsKey(c1)?mp.get(c1)+3:3);
				mp.put(c2,mp.containsKey(c2)?mp.get(c2)+0:0);
			}
			if(v1<v2){
				mp.put(c1,mp.containsKey(c1)?mp.get(c1)+0:0);
				mp.put(c2,mp.containsKey(c2)?mp.get(c2)+3:3);
			}
			if(v1==v2){
				mp.put(c1,mp.containsKey(c1)?mp.get(c1)+1:1);
				mp.put(c2,mp.containsKey(c2)?mp.get(c2)+1:1);
			}
			}
			else{
				break;
			}
		}
		int max=0;
		char m='0';
		for (Map.Entry<Character,Integer> tp: mp.entrySet()) {
			if(max<tp.getValue()){
				max=tp.getValue();
				m=tp.getKey();
			}
		}
		System.out.println(m+" "+max);
	}
}