package sub5;

/*
 * 날짜 : 2026/05/04
 * 이름 : 양지웅
 * 내용 : 5장 자바 오버라이딩 실습
 * */

class AAA {
	public void method1() {
		System.out.println("AAA : method1");
	}
	public void method2() {
		System.out.println("AAA : method2");
	}
	public void method3() {
		System.out.println("AAA : method3");
	}
}
class BBB extends AAA {
	public void method1() {
		System.out.println("BBB : method1");
	}
	public void method2() {
		System.out.println("BBB : method2");
	}
	public void method3(int a) {
		System.out.println("BBB : method3");
	}
}
class CCC extends BBB {
	// @Override 이노테이션 : Override 메서드를 표시하는 키워드, 기능은 없음
	public void method1() {
		System.out.println("CCC : method1");
	}
	public void method2() {
		System.out.println("CCC : method2");
	}
	public void method3(int a, int b) {
		System.out.println("CCC : method3");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3();
		c.method3(1, 2);
		
		// Car Override 메서드 실습
		Sedan avante = new Sedan("아반떼", "흰색", 0, 1500);
		avante.speedUp(250);
		avante.drive();
		
		Truck poter = new Truck("포터", "흰색", 0, 0);
		poter.speedUp(200);
		poter.show();
		
		// Animal override 실습
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
	}

}
