package ch08_interface.sec04;

public class MemberController {
	MemberDAO dao = new MemberDAO();
	// ȸ�� ���� �����͸� �����ϸ� �����͸� �޾Ƽ� 
	// MemberDAO Ŭ������ insertMember() �޼ҵ忡�� ����
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	}
}
