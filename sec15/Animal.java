package ch07_Inheritance.sec15;

public abstract class Animal {	//�߻� Ŭ����
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	//�߻� �޼ҵ� ����
	public abstract void sound();
	//public void sound2(); //abstract �� ���̸� body ���ٴ� ����
	
}
