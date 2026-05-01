package sub3;

/*
 * 날짜 : 2026/04/30
 * 이름 : 양지웅
 * 내용 : 5장 Java 클래스 변수, 클래스 메서드 실습
 * */

class Increment {
	public int num1;
	public static int num2; // 클래스 변수 (정적 변수)
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}



public class StaticTest {

	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		inc1.num1 = 1;
		inc2.num1 = 2;
		inc3.num1 = 3;
		
		// 클래스 변수는 객체 생성 없이 직접 접근 가능
		Increment.num2 = 1;	//num2는 클래스 변수 (정저변수) 이기 때문에 클래스 타입으로 접근 가능
		inc1.num2 = 1;
		inc2.num2 = 2;
		inc3.num2 = 3;
		
		System.out.println(inc1.num2);
		
		// Car 객체 생성 및 초기화
		Car sonata = new Car("소나타", 0);
		Car avante = new Car("아반떼", 0);
		Car toyota = new Car("토요타", 0);
		
		System.out.println("전체 차량 : " + Car.totalCar());
		sonata.show();
		avante.show();
		toyota.show();
		
		// 싱글톤 객체 예제
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		System.out.println("더하기 : " + c1.plus(2, 3));
		System.out.println("빼기 : " + c2.minus(2, 3));
		System.out.println("곱하기 : " + c2.multi(5, 7));
		System.out.println("나누기 : " + c1.div(2, 3));
		
		
		
	}

}
