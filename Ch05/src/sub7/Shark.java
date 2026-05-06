package sub7;

public class Shark extends Animal {
	@Override
	public void move() {
		System.out.println("Shark swim");
	}
	
	// 오버라이드를 위한 추상 메서드
	public void hunt() {
		System.out.println("Shark hunt");
	}
}
