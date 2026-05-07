package sub9;

import sub9.Outer.Inner;

/*
 * 날짜 : 2026/05/07
 * 이름 : 양지웅
 * 내용 : 5장 자바 중첩클래스(내부클래스, 익명객체) 실습
 * */

// 외부 클래스
class Outer {
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	
	public void show() {
		System.out.println("outer x : " + x);
	}
	
	// 내부 클래스
	class Inner {
		private int x;
		
		public Inner(int x) {
			this.x = x;
		}
		
		public void show() {
			System.out.println("inner x : " + x);
		}
		
	}
}

public class NestedTest {

	public static void main(String[] args) {
		Outer out = new Outer(1);
		out.show();
		
		// 내부 객체 생성
		Inner in = out.new Inner(2);
		in.show();
	}
}
