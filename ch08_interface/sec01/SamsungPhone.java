package ch08_interface.sec01;

public class SamsungPhone implements ISmartPhone {
	String name;
	
	public SamsungPhone() {
		name="�Ｚ��";
	}
	@Override
	public void sendCall() {
		System.out.println(name+"���� ��ȭ�� �̴ϴ�.");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub

	}

}
