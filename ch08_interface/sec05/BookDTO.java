package ch08_interface.sec05;

public class BookDTO {
		// 필드
		private String Name;
		private String Author;
		private String year;
		private String price;
		
		// 생성자
		public BookDTO(String name, String author, String year, String price) {
			super();
			Name = name;
			Author = author;
			this.year = year;
			this.price = price;
		}
		//Getter&Setter

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getAuthor() {
			return Author;
		}

		public void setAuthor(String author) {
			Author = author;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}
		
}
