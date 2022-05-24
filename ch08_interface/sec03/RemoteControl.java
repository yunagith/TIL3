package ch08_interface.sec03;

public interface RemoteControl {
	//��� �ʵ� ����
	// public, static, final �����ϴ���
	//������ �������� �ڵ����� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� ����
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	
	//����Ʈ �޼ҵ� ���� : ���� ����� ������ �ִ� �޼ҵ�
	//�⺻������ public ���� ���� : �����ϴ��� ������ �������� �ڵ����� ����
	//
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("'�������� ��ü�մϴ�/");
	}
}
