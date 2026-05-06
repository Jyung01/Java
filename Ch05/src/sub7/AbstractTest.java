package sub7;

//import sub6.Animal;

/*
 * 날짜 : 2026/05/06
 * 이름 : 양지웅
 * 내용 : 5장 자바 추상클래스 실습
 * */

public class AbstractTest {

	public static void main(String[] args) {
		sub6.Animal a6 = new sub6.Animal();	// 추상 클래스가 아니므로 생성가능
		//sub7.Animal a7 = new sub7.Animal();	// 추상 클래스 이므로 생성불가능
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		Animal[] animals = {tiger, eagle, shark};
		
		for (Animal a : animals) {
			a.move();
		}

	}

}
