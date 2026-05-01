package sub3;

public class Car {
	
	// 속성 (멤버변수)
	private String name;
	private int speed;
	public static int count;	// 클래스 변수 ( 정적 변수 ) 외부에서 클래스명.변수이름 
								// 으로 접근하기 때문에 public 선언

	
	// 생성자
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
		count++;
	}
	
	// 기능 (멤버 메서드)
	public void speedUp(int speed) {
		this.speed = speed;
	}
	
	public static int totalCar() {	// 클래스 메서드 (정적 메서드)
		return count;				// 클래스명.메서드명 으로 호출 가능
	}
	
	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("현재 속도 : " + speed);
		System.out.println("차량수 : " + count);
	}
	
}
