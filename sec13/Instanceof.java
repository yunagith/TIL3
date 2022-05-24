package ch07_Inheritance.sec13;

public class Instanceof {

	public static void main(String[] args) {
		// Instance of 연산자 예제
		Parent p =new Parent();
		System.out.println(p instanceof Parent); 	//true
		System.out.println(p instanceof Child); 		//false
		
		Child c = new Child();
		System.out.println(c instanceof Parent); 	//true (상속받아서)
		System.out.println(c instanceof Child); 		//true
		
		Parent pc =new Child(); // 자동 타입 변환
		System.out.println(pc instanceof Parent); 	//true
		System.out.println(pc instanceof Child);	//true
		
		//pc instanceof Child가 true이므로 pc는 CHild 타입으로 강제 타입 변환
		Child c2=(Child)pc;
		System.out.println("변환 오류 없음");
	}

}
