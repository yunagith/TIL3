package ch07_Inheritance.sec13;

public class Instanceof {

	public static void main(String[] args) {
		// Instance of ������ ����
		Parent p =new Parent();
		System.out.println(p instanceof Parent); 	//true
		System.out.println(p instanceof Child); 		//false
		
		Child c = new Child();
		System.out.println(c instanceof Parent); 	//true (��ӹ޾Ƽ�)
		System.out.println(c instanceof Child); 		//true
		
		Parent pc =new Child(); // �ڵ� Ÿ�� ��ȯ
		System.out.println(pc instanceof Parent); 	//true
		System.out.println(pc instanceof Child);	//true
		
		//pc instanceof Child�� true�̹Ƿ� pc�� CHild Ÿ������ ���� Ÿ�� ��ȯ
		Child c2=(Child)pc;
		System.out.println("��ȯ ���� ����");
	}

}
