package a20_8_26;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//���������� ���� ���� Iterator(���ͷ�����)
//���������� ���� ���� Enumeration(�̴��ӷ��̼�)
//Vector�� ArrayList, LinkedList ���� ����� ��
public class Collection4 {

	public static void main(String[] args) {
		Vector<String> name=new Vector(10,10); //10���� ���̼���
		name.addElement("�ָ��");
		name.addElement("�ּ���");
		name.addElement("������");
		name.addElement("�ּ���");
		
		Iterator<String> item=name.iterator();		//item����
		while(item.hasNext()) {
			System.out.println(item.next());
		}
		
		System.out.println("============");
		Enumeration<String> item2=name.elements();
		while(item2.hasMoreElements()); 
			
		}
	}


