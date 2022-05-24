package ch08_interface.sec04;

public class MemberMain {

	public static void main(String[] args) {
		// 회원 가입 정보
		MemberDTO dto = new MemberDTO("adcd","1234","홍길동","010-1234-1234","서울");
		MemberController ctrl = new MemberController();
		ctrl.insertMember(dto);
	}

}
