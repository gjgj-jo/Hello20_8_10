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
		a.remove(0);	//0번째를 삭제
		a.remove(new Integer(20));	//20이라는 정수를 삭제
		//a.remove(new Integer(30));
		show(a);
		System.out.println("==============");
		Collections.sort(a);	//Collections클래스에서 지원되는 sort라는 메소드
		show(a);
		a.set(0, 100);
		a.set(1, 200);
		show(a);
		
		
		/*for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		System.out.println("확장된 for문");
		for(int temp : a) {
			System.out.println(temp);
		}
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("홍길동");
		name.add("이기자");
		name.add("최고야");
		for(String str : name) {
			System.out.println(str);
		}
		
	
		} */

	}
}

