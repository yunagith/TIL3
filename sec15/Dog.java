package ch07_Inheritance.sec15;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	//추상 메소드 오버라이딩 (재정의)
	@Override
	public void sound() {
		System.out.println("멍멍");

	}
	//만일 추상 메소드를 오버라이딩 하지 않으면 오류
}
