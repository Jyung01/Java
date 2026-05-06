package sub6;

/*
 * 날짜 : 2026/05/06
 * 이름 : 양지웅
 * 내용 : 5장 자바 다형성 실습
 * */

public class PolyTest {

	public static void main(String[] args) {
		// 다형성을 활용한 객체 생성
		Animal tiger = new Tiger();	// 참조변수 (객체)의 타입을 부모 클래스로 선언
		Animal eagle = new Eagle(); // -> 다형성 코드 표현 (업캐스팅)
		Animal shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
		
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
