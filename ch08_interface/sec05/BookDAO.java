package ch08_interface.sec05;

public class BookDAO implements IBookDAO {

	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("���� ���� ����");
		System.out.println("������ : "+ dto.getName());
		System.out.println("�۰� : "+ dto.getAuthor());
		System.out.println("���� : "+dto.getYear());
		System.out.println("���� : "+dto.getPrice());

	}

}
