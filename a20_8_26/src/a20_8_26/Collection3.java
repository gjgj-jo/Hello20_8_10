package a20_8_26;

import java.util.Stack;

//���� stack
public class Collection3 {

	public static void show(Stack<String> name) {
		System.out.println("==========");
		while(!name.isEmpty()) {	//�ֺ����ʾ�����
			System.out.println(name.pop());	//���� �ִ°� ���� Stack�̴ϱ�
		}
	}
	public static void main(String[] args) {
		Stack<String> name=new Stack<String>();
		Stack<Integer> jumsu=new Stack<Integer>();
		name.add("ȫ�浿"); //����õ
		name.push("�̱���");	//��õ 
		name.push("�ְ��");
		show(name);

	}

}
