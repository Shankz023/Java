import java.util.Scanner;
import static java.lang.System.out;
class Seq
{
  public static void main(String[] args) {
    Seq sq=new Seq();
    sq.input();
  }
  void decode(int key,int length)
  {
    int t=64;
    int m=key;
    String code=" ";
    out.println("Decoded msg is: ");
    while(m!=0)
    {
      int y=m%10;
      m=m/10;
      code=((char)(t+y))+code;
    }
    out.println(code);
    m=key;
    out.println("Decoded msg is: ");
    while(m!=0)
    {
      int y=m%100;
      m=m/100;
      if(y<26)
      code=((char)(t+y))+code;
    }
    out.println(code);
  }
  void input()
  {
    Scanner sc=new Scanner(System.in);
    out.print("Enter the number to be decoded: ");
    String s=sc.next();
    int key=Integer.parseInt(s);
    decode(key,s.length());
  }
}
