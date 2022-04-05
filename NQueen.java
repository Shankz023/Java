import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RendringHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.SwingUtilities;

class NQueen extends JPanel{
	private int size;
	private int nbTiles;
	private int dimensions;

	private static final Color FOREGROUND_COLOR = new Color(239, 82, 80);
	private int[] tiles;
	private int tilesSize;
	private int margin;
	private int gridSize;
	private boolean gameOver;

	public NQueen(int size,int dim,int mar){
		this.size=size;
		this.dimensions=dim;
		this.margin=mar;
		nbTiles=size*size;
		tiles=new int[(size*size)+1];
		gridSize = (dim - 2 * margin);
		tileSize = gridSize / size;

		setPreferredSize(new Dimension(dimensions,dimensions+margin));
		setBackground(Color.WHITE);
		setForeground(FOREGROUND_COLOR);

		gameOver=true;

		addMouseListener(new MouseAdapter()){
			@Override
			public void mousePressed(MouseEvent e){
				if(gameOver){
					newgame();
				}
				else
				{
					int ex=e.getX()-margin;
					int ey=e.getY()-margin;
					if (ex < 0 || ex > gridSize  || ey < 0  || ey > gridSize)
						return;
					int c1=ex/tileSize;
					int r1=ex/tileSize;

					int clickPos = r1 * size + c1;
				}
			}
		}
	}
}