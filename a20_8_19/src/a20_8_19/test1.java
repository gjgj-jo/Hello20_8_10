package a20_8_19;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class test1 extends Applet {

	
	
	
	
	@Override
	public void paint(Graphics g) {//applet을 상속받아서 하고있음.
		//paint는 그려라 라는 뜻 graphics 'g'는 연필이라는 뜻
		Color c=new Color(255,0,0);//color을 만들 능력이 x 그래서 new써서 사용 
        //R G B ↑하얀색
		Font f=new Font("궁서체",Font.BOLD, 15);
		g.setColor(c); //연필(g)에 위에서 만든 c를 넣는다 (set은 넣는다)
		g.setFont(f);
		g.drawString("대한민국", 100, 100);
		
		
		Font f2=new Font("휴먼매직체", Font.BOLD+Font.ITALIC,18);
		Color c2=Color.pink; // 맨 위에랑 달리 이런방법도 있다는걸 보여줌.new 안하고 바로쓸수있음
		g.setColor(c2);
		g.drawString("애플릿연습", 100, 200);
	
		
	
	}

	public void destroy() {
		System.out.println("꺼짐");
	}

	public void init() {	//처음
		System.out.println("초기");
		
	}

	public void start() {
		System.out.println("시작");
		
	}

	public void stop() {
		System.out.println("멈춤");
	
	}
	
}
