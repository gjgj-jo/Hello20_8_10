package a20_8_26;

import java.util.Vector;

//Vector �迭
public class Collection2 {

	public static void show(Vector<String> vec)	{
		for(String name : vec) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(2,2);//�⺻2�� �Ҵ�ް�, ������ 2�� ����
		vec.add("ȫ�浿");
		System.out.println(vec.size()+","+vec.capacity());
		
		vec.add("�̼���");
		System.out.println(vec.size()+","+vec.capacity());
		
		vec.add("�̱���");
		System.out.println(vec.size()+","+vec.capacity());

		
		vec.addElement("�ְ��");	//add�� ����
		show(vec);
		
		vec.remove(0);
		vec.removeElement("�ְ��");
		show(vec);
	}

}
