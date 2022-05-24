package ch08_interface.sec04;

import java.util.ArrayList;

public interface IMemberDAO {
	// �߻� �޼ҵ� ����
	public void insertMember(MemberDTO dto); 		// ȸ�� ���
	public void deleteMember(String memId); 			// ȸ�� ���� ����
	public ArrayList<MemberDTO> getAllMember();  // ��ü ȸ�� ���� ��ȸ
	public void updateMember(MemberDTO dto);		// ȸ�� ���� ����
}

