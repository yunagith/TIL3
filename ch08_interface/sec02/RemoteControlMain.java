package ch08_interface.sec02;

public class RemoteControlMain {

	public static void main(String[] args) {
		// �������̽� ���� ����
		// �������̽� ���� ����
		RemoteControl rc =null;
		
		//Television ��ü�� �������̽� Ÿ�Կ� ����
		rc = new Television();
		rc.turnOn();			//�߻� �޼ҵ� ���
		rc.setVolume(10);	//�߻� �޼ҵ� ���
		rc.setMute(true);	//����Ʈ �޼ҵ� ���
		rc.setMute(false);	//����Ʈ �޼ҵ� ���
		rc.turnOff();			//�߻� �޼ҵ� ���
		
		System.out.println("---------------------------");
		// ����� ���������� ���
		rc = new Audio();
		rc.turnOn();			//�߻� �޼ҵ� ���
		rc.setVolume(10);	//�߻� �޼ҵ� ���
		rc.setMute(true);	//����Ʈ �޼ҵ� ���
		rc.setMute(false);	//����Ʈ �޼ҵ� ���
		rc.turnOff();			//�߻� �޼ҵ� ���
		
		
	}
	
}
