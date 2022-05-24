package ch08_interface.sec03;

public class SmartRemoteControlMain {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		Searchable sch =tv;
		sch.search("www.naver.com");
	}

}
