package ch08_interface.sec04;

public class MemberMain {

	public static void main(String[] args) {
		// ȸ�� ���� ����
		MemberDTO dto = new MemberDTO("adcd","1234","ȫ�浿","010-1234-1234","����");
		MemberController ctrl = new MemberController();
		ctrl.insertMember(dto);
	}

}
