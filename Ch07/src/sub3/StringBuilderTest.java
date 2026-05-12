package sub3;

/*
 * 날짜 : 2026/05/11
 * 이름 : 양지웅
 * 내용 : 7장 자바 내장클래스 실습 - StringBuilder
 * */


public class StringBuilderTest {

	public static void main(String[] args) {
		// String 불변성(immutable)으로 인한 메모리 낭비
		String str = "Java";
		System.out.println("str : " + str);
		
		str += "Programing";
		System.out.println("str : " + str);
		
		// StringBuilder로 메모리 절약
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb : " + sb);
		
		sb.append("Programming");
		System.out.println("sb : " + sb);
		
		
	}

}
