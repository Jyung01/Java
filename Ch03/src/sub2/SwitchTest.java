package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2026/04/27
 * 이름 : 양지웅
 * 내용 : 3장 조건문 switch 실습
 * */

public class SwitchTest {

	public static void main(String[] args) {
		System.out.print("숫자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println("입력한 숫자 : " + number);
		
		switch (number % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		}

	}

}
