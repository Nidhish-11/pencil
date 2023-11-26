import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Pencil implements MouseMotionListener,MouseListener
{
	JFrame f;
	int x=0,y=0;
	Pencil()
	{
		f=new JFrame("Pencil");
		f.setSize(400,400);
		f.setLayout(null);
		f.addMouseMotionListener(this);
		f.addMouseListener(this);
		f.setVisible(true);
	}
	public void mouseMoved(MouseEvent e)
	{
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=f.getGraphics();
		//g.setColor(Color.red);
		if(x!=0 && y!=0)
		g.drawLine(x,y,e.getX(),e.getY());
		x=e.getX();
		y=e.getY();
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mousePressed(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
		x=y=0;
	}
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}
	public static void main(String z[])
	{
		new Pencil();
	}
}
