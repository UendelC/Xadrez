import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class Smile extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent( g );
		g.setColor(Color.BLACK);
		g.fillRect(0,0,100,100);
	}
}
public class Test{
	public static void main( String [] args){
		Smile panel = new Smile();
		JFrame application= new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,400);
		application.setVisible( true );
	}
}