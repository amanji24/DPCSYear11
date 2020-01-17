import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

public class MyCanvas extends Canvas implements MouseListener, KeyListener {

	public MyCanvas() {
		this.setSize(800,440);
		this.addMouseListener(this);
		this.addKeyListener(this);
	}
	
	boolean clicked = false;
	boolean build = false;
	boolean stuffThere = false;
	
	int[] arr1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int[][] rule30Box = Rule30.rule30(arr1, 16);
	
	int[] click = new int[31];
	int[][] clickBox = new int[16][31];
	
	ArrayList<Integer> tempCols = new ArrayList<Integer>();
	//ArrayList<int[]> tempBlocks = new ArrayList<int[]>();
	
	ArrayList<Integer> clickCols = new ArrayList<Integer>();
	ArrayList<Integer> clickRows = new ArrayList<Integer>();
	
	int[] arr = Rule30.genLine(31);
	int[][] rule30BoxRand = Rule30.rule30(arr, 16);
	
	int[][] grid = new int[16][31];
	
	int paintCount = 0;
	
	Color color = new Color((int) (Math.random()*0xFFFFFF));
	Color old = color;
	
	public void paint(Graphics g) {
		
		if (build) {
			old = color;
			for (int i = 0; i < click.length; i++) {
				if (clickCols.contains(i)) {
					click[i] = 1;
				} else {
					click[i] = 0;
				}
			}
			clickBox = Rule30.rule30(click, 16);
			clickRows.clear();
			clickCols.clear();
			//tempBlocks.clear();
			tempCols.clear();
			build = false;
		}
		
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				g.setColor(old);
				int[] curPt = {c, r};
				//if (alHasArr(tempBlocks, curPt)) {
				if (r == 0 && tempCols.contains(c)) {
					g.setColor(color);
					g.fillRect(c*24+28, r*24+14, 24, 24);
				} else if (!stuffThere) {
					g.setColor(Color.BLACK);
					g.drawRect(c*24+28, r*24+14, 24, 24);
				} else {
					if (clickBox[r][c] == 1) {
						g.fillRect(c*24+28, r*24+14, 24, 24);
					} else {
						g.setColor(Color.BLACK);
						g.drawRect(c*24+28, r*24+14, 24, 24);
					}
				}
			}
		}
		
		paintCount++;
		
		repaint();
		
	}
	
	
	public boolean alHasArr(ArrayList<int[]> al, int[] arr) {
		for (int i = 0; i < al.size(); i++) {
			if (Arrays.equals(al.get(i), arr)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkPoint(int row, int col) {
		if (row < 0) {
			return false;
		} else if (row > 15) {
			return false;
		} else if (col < 0) {
			return false;
		} else if (col > 30) {
			return false;
		}
		return true;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int[] point = {e.getX(), e.getY()};
		int row = (e.getY()-14)/24;
		int col = (e.getX()-28)/24;
		if (checkPoint(row, col)) {
			if (clickCols.isEmpty()) {
				color = new Color((int) (Math.random()*0xFFFFFF));
			}
			clicked = true;
			stuffThere = true;
			clickRows.add(row);
			clickCols.add(col);
			int[] pt = {col, row};
			tempCols.add(col);
			//tempBlocks.add(pt);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		if (key == 32 && clicked) {
			build = true;
		}
		
	}
	
}
