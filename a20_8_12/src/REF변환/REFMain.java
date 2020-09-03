package REF변환;

import javax.swing.JFrame;

public class REFMain {

	public static void call(Point temp) {	// (  )안에 이름은 맘대로
		if(temp instanceof Point3D)	{//instanceof=객체. temp라는 보따리가 point3d객체였나?
			Point3D p=(Point3D)temp;	//int a=(int) 10.5; temp부모 point3d자식 작은방들어가려고 몸작게
			p.setX(10);
			p.setY(20);
			p.setZ(30);
			p.show();
		}
		else if(temp instanceof Point) {
			Point yp=(Point)temp;
			temp.setX(100);
			temp.setY(200);
			temp.show();
		}
	}
	public static void main(String[] args) {
		Point p=new Point3D();		//자식보따리를 부모보따리에 맡겨도 된다 
								//부모클래스의 객체의 저장가능 [업캐스트] 자식꺼를 맞기고있음
		call(p);	//부모 보따리. temp쪽으로 던지고 Point가 받아냄 위에서 물어봐야함.
					//자식의 객체명을 전달
		
		Point x=new Point();		//자기가 자기꺼를 가지는 것 그래서 던지면 받아야함
		call(x);	//부모의 객체명을 전달

		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setTitle("연습프레임");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10,30,500,500);
	}

}
