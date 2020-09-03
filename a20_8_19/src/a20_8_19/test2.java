package a20_8_19;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class test2 extends Applet {
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(50, 100, 150, 100);
		g.drawRect(250, 100, 100, 150);
		g.fillRect(250, 300, 100, 150);
		g.drawOval(450, 100, 100, 100);
		
		int x[]= {650,600,800};
		int y[]= {100,200,200};
		
		g.drawPolygon(x,y,3);
	}
}
