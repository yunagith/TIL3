package ch08_interface.sec04;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {

	@Override
	public void insertMember(MemberDTO dto) {
		// DB�� �����ߴٰ� ����
		System.out.println("ȸ�� ��� ����");
		System.out.println("ID : "+ dto.getMemId());
		System.out.println("��й�ȣ : "+ dto.getMemPass());
		System.out.println("���� : "+dto.getMemName());
		System.out.println("��ȭ : "+dto.getMemphone());
		System.out.println("�ּ� : "+dto.getMemAddress());
	}

	@Override
	public void deleteMember(String memId) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

}
