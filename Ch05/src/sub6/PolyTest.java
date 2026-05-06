package sub6;

/*
 * 날짜 : 2026/05/06
 * 이름 : 양지웅
 * 내용 : 5장 자바 다형성 실습
 * */

public class PolyTest {

	public static void main(String[] args) {
		// 다형성을 활용한 객체 생성
		Animal a1 = new Tiger();	// 참조변수 (객체)의 타입을 부모 클래스로 선언
		Animal a2 = new Eagle(); // -> 다형성 코드 표현 (업캐스팅)
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// 객체 타입확인 연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 객체입니다");
		} else if (a1 instanceof Eagle) {
			System.out.println("a1은 Tiger 객체입니다");
		} else if (a1 instanceof Shark) {
			System.out.println("a1은 Tiger 객체입니다");
		}
		
		// 다운캐스팅
		Tiger tiger = (Tiger)a1; // 명시적 형변환
		Eagle eagle = (Eagle)a2;
		Shark shark = (Shark)a3;
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		Cat c = new Cat();
		Dog d = new Dog();
		printSound(c);
		printSound(d);
		
		
		
	} 
	public static void printSound(Pet p) {
		p.makeSound();
	}

}
