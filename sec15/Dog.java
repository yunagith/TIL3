package ch07_Inheritance.sec15;

public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}
	
	//�߻� �޼ҵ� �������̵� (������)
	@Override
	public void sound() {
		System.out.println("�۸�");

	}
	//���� �߻� �޼ҵ带 �������̵� ���� ������ ����
}
