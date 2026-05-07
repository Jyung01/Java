package class1.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		isBorrowd = false;
	}
	
	public void borrowBook() {
		if(isBorrowd) {
			System.out.println(title + " 이미 대출됨");
		}else {
			isBorrowd = true;
			System.out.println("도서 대출 : " + title);
		}
	}
	
	public void returnBook() {
		if(isBorrowd) {
			isBorrowd = false;
			System.out.println("도서 반납 : " + title);
		}else {
			System.out.println("이미 반납함");
		}
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		if (isBorrowd) {
			System.out.println("대출여부 : 불가능");
		} else {
			System.out.println("대출여부 : 가능");
		}	
	}
	
	public String getTitle() {
		return title;
	}
	
	
}
