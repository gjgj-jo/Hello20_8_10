package a20_9_1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

public class RunnableTest extends Applet 
					implements Runnable {
	
	Font font;
	Thread kim=null;
	
	public void run() {
		while(true) {
			try {
				kim.sleep(1000); //1초 쉼
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint(); //paint() 메소드 호출
		}
	}
		public void init() {
			font=new Font("궁서체",Font.BOLD,40);
			this.setBackground(Color.yellow);
		}
		
		public void start() {
			if(kim==null) {
				kim=new Thread();
				kim.start();			//run()호출
			}
		}
		
		public void paint(Graphics g) {
			
			Calendar now=Calendar.getInstance();
			int year=now.get(Calendar.YEAR);
			int month=now.get(Calendar.MONTH)+1;
			int date=now.get(Calendar.DATE);
			int hour=now.get(Calendar.HOUR);
			int min=now.get(Calendar.MINUTE);
			int sec=now.get(Calendar.SECOND);
			String str=year+"년"+month+"월"+date+"일 "+hour+":"+min+":"+sec;
			
			System.out.println(now);
			g.setFont(font);
			g.drawString(str, 10, 40);
		}
	}
	


