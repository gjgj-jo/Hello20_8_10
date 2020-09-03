package a20_8_26;

import java.util.Hashtable;
import java.util.Set;

//map(맵) : key, value를 한쌍으로 구성된 것  //순차구조가 아님
//맵 종류중에서 HashTable 클래스 활용
public class Collection5 {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("홍길동", "두구,010-939-997,18");
		ht.put("이순자", "뿌구,010-939-997,18");
		ht.put("이기자", "구구,010-939-997,18");
		ht.put("허준", "대구,010-939-997,18");
		
		Set<String> name=ht.keySet();
		for(String item : name) {
			System.out.println(item +":" + ht.get(item));
		}
		
		System.out.println("==================");
		System.out.println(ht.get("이기자"));		//허준 값
	}

}
