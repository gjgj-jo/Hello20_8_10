package a20_8_26;

import java.util.Stack;

//스택 stack
public class Collection3 {

	public static void show(Stack<String> name) {
		System.out.println("==========");
		while(!name.isEmpty()) {	//텅비지않았으면
			System.out.println(name.pop());	//위에 있는게 나옴 Stack이니까
		}
	}
	public static void main(String[] args) {
		Stack<String> name=new Stack<String>();
		Stack<Integer> jumsu=new Stack<Integer>();
		name.add("홍길동"); //비추천
		name.push("이기자");	//추천 
		name.push("최고야");
		show(name);

	}

}
