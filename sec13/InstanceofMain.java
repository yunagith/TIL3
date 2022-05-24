package ch07_Inheritance.sec13;

public class InstanceofMain {
	public static void method1(Parent parent) {
		//���� Ÿ�� ��ȯ�ϱ� ���� instanceof �����ڷ� ���� Ȯ��
		if(parent instanceof Child) {
			Child c = (Child)parent; //���� Ÿ�� ��ȯ
			System.out.println("method1-Child�� ��ȯ ����");
		}else {
			System.out.println("method1-Child�� ��ȯ���� ����");
		}
	}
	public static void method2(Parent parent) {
		//���� Ÿ�� ��ȯ�ϱ� ���� instance �����ڷ� ���� Ȯ������ �ʰ� �ٷ� ���� Ÿ�� ��ȯ
		if(parent instanceof Child) {
			Child c = (Child)parent; //���� Ÿ�� ��ȯ
			System.out.println("method2-Child�� ��ȯ ����");
		}
	}
	public static void main(String[] args) {
		// instanceof ������ ���� : ���� Ÿ�� ��ȯ�ϱ� ���� ���� Ÿ�� Ȯ��
		Parent pA=new Child(); // �ڵ� Ÿ�� ��ȯ
		method1(pA);
		
		Parent pB=new Parent();
		method1(pB);
		
		//  instance �����ڷ� ���� Ȯ������ �ʰ� �ٷ� ���� Ÿ�� ��ȯ
		method2(pA); //��ȯ ����
		method2(pB);	//��ȯ �Ұ� : ���� �߻�
		// ��� : ���� Ÿ�� ��ȯ�ϱ� ���� instanceof �����ڷ� ���� Ȯ���ϰ� ��ȯ ����
		
	}

}






