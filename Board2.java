package nqueen;
import nqueen.SQueen;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.net.URL;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
class Board2 extends JPanel
{
	private Image queen_img=null;

	private int[] mx=new int[80];
	private int[] my=new int[80];
	private int k=0;
	private static boolean danger=false;
	private int[][] queen_pos=new int[8][8];
    static int dx,dy;


	public Board2()
	{
		addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e){
				int x,y;
				x=e.getX();
				x=(x/100)*100;
				y=e.getY();
				y=(y/100)*100;
				mx[k]=x;
				my[k]=y;
				SQueen sq=new SQueen();
				danger=sq.isNotSafe(queen_pos,x/100,y/100);
				if(danger==false)
					{
						k++;
					}
				if(k<9)
				{
					arrayValue(x,y);
					repaint();
					if(k==8)
							JOptionPane.showMessageDialog(null,"Winner","Completed",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					printArray(queen_pos);
					JOptionPane.showMessageDialog(null,"No More Queen","Out Of Stock",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
	}

	public void printArray(int[][] mat)
	{
		for(int x1[]:mat){
			for(int x2:x1)
				System.out.print(x2);
			System.out.println();}
	}

	public void arrayValue(int x,int y)
	{
		SQueen sq=new SQueen();
		int px,py;
		px=(x/100);
		py=(y/100);
		danger=sq.isNotSafe(queen_pos,px,py);
		if(danger==true)
		{
			dx=px;
			dy=py;

			System.out.println("danger is: "+danger+" "+dx+" "+dy);
		}
		else
			queen_pos[px][py]=1;
	}

	public void paint(Graphics g)
	{
		//SQueen sq=new SQueen();
		//danger=sq.isNotSafe(queen_pos,dx,dy);
		g.setColor(Color.BLACK);
		if(queen_img==null)
			queen_img=getImage("CQueen.png");


		g.fillRect(0,0,800,800);
		g.setColor(Color.BLACK);

		for(int i=0;i<=700;i+=200)
			for(int j=0;j<=700;j+=200){
				g.clearRect(i,j,100,100);
			}
			
			
			for(int i=100;i<=800;i+=200)
				for(int j=100;j<=800;j+=200){
					g.clearRect(i,j,100,100);
				}
				for(int i=0;i<=700;i+=100)
					for(int j=0;j<=700;j+=100){
				g.setColor(Color.BLUE);
				g.drawRect(i,j,100,100);
			}
			if(danger==true)
			{
				g.setColor(Color.RED);
				g.fillRect((dx*100),(dy*100),100,100);
			}
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
				{
					//if(danger==false)
						if(queen_pos[i][j]==1)
							g.drawImage(queen_img,(i*100)+20,(j*100)+20,60,60,this);
				}
		}
		g.setColor(Color.BLACK);
		g.drawRoundRect(0, 0, 800,800, 0, 0);
	}

	public Image getImage(String path)
		{
			Image tempImage=null;
			try
			{
				URL imageURL=Board2.class.getResource(path);
				tempImage=Toolkit.getDefaultToolkit().getImage(imageURL);
			}
			catch(Exception e)
			{
				System.out.println("ERROR OCCURED");
			}
			return tempImage;
		}

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.add(new Board2(),BorderLayout.CENTER);
		frame.setSize(900,900);
		frame.getContentPane().add(new Board2());
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}