package sub1;

public class Book {
	
	String title;
	String author;
	int copies;
	
	public boolean borrowBook() {
		if (copies >= 1) {
			copies--;
			return true;
		} else {
			return false;
		}
	}
	
	public void returnBook() {
		copies++;
	}
	
	public void show() {
		System.out.println("책이름 : " + title);
		System.out.println("저자명 : " + author);
		System.out.println("복사본 : " + copies);
	}
	
}
