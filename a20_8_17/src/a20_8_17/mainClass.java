package a20_8_17;
//�������̽��� : Ŭ������ �����ϰ� ��������� ����޼ҵ�� ������ �����̴�. (��θ�,�˷���������)

//�ڹٴ� ���ϻ�Ӹ� �����ϴ�. �̷� ������ �����ϱ� ���ؼ� �������̽��� ���Դ�.
//�������̽� �ڽ�Ŭ�������� ������ִ� ���Ҹ� �Ѵ�.
//�����δ� new�� �������� �ʴ´�.

//�������̽�
//-������� public static final ���ݰ���
//-����޼ҵ�� public abstract ���ݰ���. ��, ���� �����ϰ� �ڽ��� �������̵��Ͽ� ����Ͽ��� �Ѵ�.

//class A {}
//class B {}
//class C extends A,B { } (X) extends �ڿ��� ģ�θ� 1����
//class D extends B {  } (0}

//interface X {}
//class Y extends X { } (X) ��������
//class Y implements X {  } (0)


//class Z extends A implements X (0) 
class childTest implements InterTest{	//interface�� implements�� ��ӹ޽��ϴ�. �ڽ��� ������

	@Override
	public void draw() {
		//interface���� ��ӹ޾ұ� ������ (implements) �������Ǹ� �ؾ��Ѵ�.
		//�ڽ��� �������̵� �ؼ� �����ؾ��Ѵ�.
	}		
	
}
public class mainClass {

	public static void main(String[] args) {
		//new interface
	}

}
