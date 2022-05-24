package ch08_interface.sec05;

public class BookDAO implements IBookDAO {

	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("도서 정보 관리");
		System.out.println("도서명 : "+ dto.getName());
		System.out.println("작가 : "+ dto.getAuthor());
		System.out.println("출판 : "+dto.getYear());
		System.out.println("가격 : "+dto.getPrice());

	}

}
