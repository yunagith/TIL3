package ch08_interface.sec01;

public class IPhone implements ISmartPhone {
String name;

public IPhone() {
	name="������";
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
