package a20_8_26;

import java.util.Vector;

//Vector 배열
public class Collection2 {

	public static void show(Vector<String> vec)	{
		for(String name : vec) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(2,2);//기본2개 할당받고, 꽉차면 2씩 증가
		vec.add("홍길동");
		System.out.println(vec.size()+","+vec.capacity());
		
		vec.add("이순자");
		System.out.println(vec.size()+","+vec.capacity());
		
		vec.add("이기자");
		System.out.println(vec.size()+","+vec.capacity());

		
		vec.addElement("최고야");	//add와 같음
		show(vec);
		
		vec.remove(0);
		vec.removeElement("최고야");
		show(vec);
	}

}
