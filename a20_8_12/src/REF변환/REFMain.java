package REF��ȯ;

import javax.swing.JFrame;

public class REFMain {

	public static void call(Point temp) {	// (  )�ȿ� �̸��� �����
		if(temp instanceof Point3D)	{//instanceof=��ü. temp��� �������� point3d��ü����?
			Point3D p=(Point3D)temp;	//int a=(int) 10.5; temp�θ� point3d�ڽ� ����������� ���۰�
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
		Point p=new Point3D();		//�ڽĺ������� �θ𺸵����� �ðܵ� �ȴ� 
								//�θ�Ŭ������ ��ü�� ���尡�� [��ĳ��Ʈ] �ڽĲ��� �±������
		call(p);	//�θ� ������. temp������ ������ Point�� �޾Ƴ� ������ ���������.
					//�ڽ��� ��ü���� ����
		
		Point x=new Point();		//�ڱⰡ �ڱⲨ�� ������ �� �׷��� ������ �޾ƾ���
		call(x);	//�θ��� ��ü���� ����

		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setTitle("����������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10,30,500,500);
	}

}
