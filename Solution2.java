import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static String isBalanced(String s) 
    {
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
			
            switch(c){
                case ')':
                    if(stck.isEmpty()||(stck.peek().equals(Character.valueOf(c)))){
                        if(!stck.isEmpty()){
                            System.out.println(stck.peek());
                        }
                        return "false";
                    }
                    else{
						System.out.println(stck.peek().equals(Character.valueOf(c)));
                        stck.pop();
                    }
                    break;
                case ']':
                    if(stck.isEmpty()||(stck.peek().equals(Character.valueOf(c)))){
                        return "false";
                    }
                    else{
                        stck.pop();
                    }
                    break;
                case '}':
                    if(stck.isEmpty()||(stck.peek().equals(Character.valueOf(c)))){
                        return "false";
                    }
                    else{
                        stck.pop();
                    }
                    break;
                default:
                    stck.push(Character.valueOf(c));
					System.out.println(stck.peek());
            }
        }
        if(stck.isEmpty()){
            return "true";
        }
        return "false";
    }
    
}

class Solution2 {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
