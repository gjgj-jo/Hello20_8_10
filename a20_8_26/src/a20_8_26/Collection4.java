package a20_8_26;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//순차접근을 위한 집합 Iterator(이터레이터)
//순차접근을 위한 집합 Enumeration(이뉴머레이션)
//Vector나 ArrayList, LinkedList 에서 사용할 것
public class Collection4 {

	public static void main(String[] args) {
		Vector<String> name=new Vector(10,10); //10개씩 늘이세요
		name.addElement("최명실");
		name.addElement("최수지");
		name.addElement("최진실");
		name.addElement("최순실");
		
		Iterator<String> item=name.iterator();		//item집합
		while(item.hasNext()) {
			System.out.println(item.next());
		}
		
		System.out.println("============");
		Enumeration<String> item2=name.elements();
		while(item2.hasMoreElements()); 
			
		}
	}


