import java.io.*;
class Buf
{
	public static void main(String[] args) throws Exception
	 {
	FileWriter er=new FileWriter("E:\\buff.txt");
	BufferedWriter wr=new BufferedWriter(er);
	wr.write("Hello shankz");
	wr.close();
	System.out.println("Done");	
	}
}