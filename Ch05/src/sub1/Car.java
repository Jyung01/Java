package sub1;

public class Car {
	
	//속성 (멤버변수)
	String brand;
	String color;
	int speed;
	
	//기능 (멤버 메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량 명 : " + this.brand);
		System.out.println("차량 색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}

}
