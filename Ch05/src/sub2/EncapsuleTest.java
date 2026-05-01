package sub2;

/*
 * 날짜 : 2026/04/29
 * 이름 : 양지웅
 * 내용 : 5장 Java 캡슐화 실습
 * */

public class EncapsuleTest {

	public static void main(String[] args) {
		// Car 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);	//생성자 초기화
		Car avante = new Car();	//생성자 초기화
		avante.setBrand("아반떼");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		sonata.setColor("은색");	// 안전하게 setter 로 수정
		
		sonata.show();
		//avante.show();
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getSpeed());

		
		// Account 객체
		Account kb = new Account("국민은행", "110-11-1234", "김유신", 1000);
		kb.show();
		
		// Book 객체
		Book javabook = new Book("이것이 자바다", "신용권", 3);
		javabook.show();
		
		// Member 객체
		Member m = new Member("김유신", 24, true);
		m.show();
		
		Movie titanic = new Movie("타이타닉", "제임스카메론", 10.0, 200);
		titanic.showDetails();

	}

}
