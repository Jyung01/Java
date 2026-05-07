package class1.sub4;

public class Member {
	private String name;
	private String memberId;
	private Book borrowdBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		borrowdBook = null;
	}
	
	public void borrowBook(Book book) {
		borrowdBook = book;
		book.borrowBook();
	}
	
	public void returnBook(Book book) {
		book.returnBook();
		borrowdBook = null;
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		if(borrowdBook == null) {
			System.out.println("대출한 도서 : 없음");
		} else {
			System.out.println("대출한 도서 : " + borrowdBook.getTitle());
		}
	}
	
	
}
