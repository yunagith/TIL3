package ch08_interface.sec05;

public class BookMain {

	public static void main(String[] args) {
		BookDTO dto = new BookDTO("ȫ�浿","������","2022��","20000��");
		BookController bc = new BookController();
		bc.insertBook(dto);

	}

}
