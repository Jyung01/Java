package sub1;

/*
 * 날짜 : 2026/04/29
 * 이름 : 양지웅
 * 내용 : 5장 Java 클래스 기본 실습
 * */

public class ClassTest {

	public static void main(String[] args) {
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car();
		avante.brand = "아반떼";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-11-1234";
		kb.name = "김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.show();
		
		/*
		 * 은행 : 우리은행
		 * 계좌 : 101-22-1001
		 * 입금주 : 김춘추
		 * 잔액 : 15000
		 * */
		
		Account ur = new Account();
		ur.bank = "우리은행";
		ur.id = "101-22-1001";
		ur.name = "김춘추";
		ur.balance = 5000;
		
		ur.deposit(20000);
		ur.withdraw(10000);
		ur.show();
		
		Book javabook = new Book();
		javabook.title = "이것이 자바다";
		javabook.author = "신용권";
		javabook.copies = 3;
		
		boolean result = javabook.borrowBook();
		if (result) {
			System.out.println("대출 성공");
			javabook.show();
		} else {
			System.out.println("대출 실패");
			javabook.returnBook();
			javabook.show();
		}
		
		// member 객체 생성
		Member m = new Member();
		m.name = "김유신";
		m.age = 14;
		m.isActive = false;
		
		m.activate();
		boolean isAdult = m.isAdult();
		if (isAdult) {
			m.show();
			System.out.println("성인입니다");
		} else {
			m.show();
			System.out.println("미성년자입니다.");
		}

	}

}
