package ch08_interface.sec02;

public interface RemoteControl {
	//상수 필드 선언
	// public, static, final 생략하더라도
	//컴파일 과정에서 자동으로 붙음
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 선언
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	
	//디폴트 메소드 정의 : 실행 블록을 가지고 있는 메소드
	//기본적으로 public 접근 제한 : 생략하더라도 컴파일 과정에서 자동으로 붙음
	//
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}
