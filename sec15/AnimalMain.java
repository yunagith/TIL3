package ch07_Inheritance.sec15;

public class AnimalMain {

	public static void main(String[] args) {
		// �߻� Ŭ���� ����
		Dog dog=new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("------------------------");
		
		//�߻� Ŭ������ new �����ڷ� ��ü ���� �Ұ�
		//Cannot instantiate the type Animal
		//Animal animal = new Animal();
		
		Animal animal =null;
		
		animal=new Dog(); //�ڵ� Ÿ�� ��ȯ
		animal.sound();		//�����ǵ� �޼ҵ� ȣ��
		
		animal=new Cat(); //�ڵ� Ÿ�� ��ȯ
		animal.sound();		//�����ǵ� �޼ҵ� ȣ��
		
		System.out.println("------------------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	//�Ű����� �ڵ� Ÿ�� ��ȯ - �Ű����� ������
	public static void animalSound(Animal animal) {
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
	}
}
