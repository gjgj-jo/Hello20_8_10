package a20_8_26;

import java.util.ArrayList;
import java.util.Collections;
import javax.print.DocFlavor.STRING;

//ArrayList
public class Collection1 {

	
	public static void show(ArrayList<Integer> a) {
		for(int num : a)	{
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		a.add(20);
		a.remove(0);	//0��°�� ����
		a.remove(new Integer(20));	//20�̶�� ������ ����
		//a.remove(new Integer(30));
		show(a);
		System.out.println("==============");
		Collections.sort(a);	//CollectionsŬ�������� �����Ǵ� sort��� �޼ҵ�
		show(a);
		a.set(0, 100);
		a.set(1, 200);
		show(a);
		
		
		/*for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		System.out.println("Ȯ��� for��");
		for(int temp : a) {
			System.out.println(temp);
		}
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("ȫ�浿");
		name.add("�̱���");
		name.add("�ְ��");
		for(String str : name) {
			System.out.println(str);
		}
		
	
		} */

	}
}

