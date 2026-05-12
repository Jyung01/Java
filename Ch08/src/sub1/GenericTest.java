package sub1;

/*
 * 날짜 : 2026/05/12
 * 이름 : 양지웅
 * 내용 : 8장 자바 제네릭(Generic) 실습
 * */

public class GenericTest {

	public static void main(String[] args) {
		Apple apple = new Apple("한국", 5000);
		Banana banana = new Banana("일본", 3000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Banana> bananaBox = new FruitBox<>();
		appleBox.setFruit(apple);
		bananaBox.setFruit(banana);
		
		System.out.println(appleBox.getFruit());
		System.out.println(bananaBox.getFruit());

	}

}
