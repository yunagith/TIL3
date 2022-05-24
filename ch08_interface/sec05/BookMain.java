package ch08_interface.sec05;

public class BookMain {

	public static void main(String[] args) {
		BookDTO dto = new BookDTO("È«±æµ¿","±èÀ¯³ª","2022³â","20000¿ø");
		BookController bc = new BookController();
		bc.insertBook(dto);

	}

}
