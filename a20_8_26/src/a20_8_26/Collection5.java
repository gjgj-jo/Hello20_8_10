package a20_8_26;

import java.util.Hashtable;
import java.util.Set;

//map(��) : key, value�� �ѽ����� ������ ��  //���������� �ƴ�
//�� �����߿��� HashTable Ŭ���� Ȱ��
public class Collection5 {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("ȫ�浿", "�α�,010-939-997,18");
		ht.put("�̼���", "�ѱ�,010-939-997,18");
		ht.put("�̱���", "����,010-939-997,18");
		ht.put("����", "�뱸,010-939-997,18");
		
		Set<String> name=ht.keySet();
		for(String item : name) {
			System.out.println(item +":" + ht.get(item));
		}
		
		System.out.println("==================");
		System.out.println(ht.get("�̱���"));		//���� ��
	}

}
