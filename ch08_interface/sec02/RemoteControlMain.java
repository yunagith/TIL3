package ch08_interface.sec02;

public class RemoteControlMain {

	public static void main(String[] args) {
		// 인터페이스 생성 예제
		// 인터페이스 변수 선언
		RemoteControl rc =null;
		
		//Television 객체를 인터페이스 타입에 대입
		rc = new Television();
		rc.turnOn();			//추상 메소드 사용
		rc.setVolume(10);	//추상 메소드 사용
		rc.setMute(true);	//디폴트 메소드 사용
		rc.setMute(false);	//디폴트 메소드 사용
		rc.turnOff();			//추상 메소드 사용
		
		System.out.println("---------------------------");
		// 오디오 리모컨으로 사용
		rc = new Audio();
		rc.turnOn();			//추상 메소드 사용
		rc.setVolume(10);	//추상 메소드 사용
		rc.setMute(true);	//디폴트 메소드 사용
		rc.setMute(false);	//디폴트 메소드 사용
		rc.turnOff();			//추상 메소드 사용
		
		
	}
	
}
