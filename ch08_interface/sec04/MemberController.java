package ch08_interface.sec04;

public class MemberController {
	MemberDAO dao = new MemberDAO();
	// 회원 가입 데이터를 전달하면 데이터를 받아서 
	// MemberDAO 클래스의 insertMember() 메소드에게 전달
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	}
}
