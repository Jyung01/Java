package sub2;

/*
 * 날짜 : 2026/04/27
 * 이름 : 양지웅
 * 내용 : 다양한 출력 실습
 * */
public class PrintTest {

	public static void main(String[] args) {
		// println : 라인 출력
		System.out.println("Hello Java!"); //println (print line) : 출력후 라인이동
		System.out.println("Welcome Java!");
		
		// print : 기본 출력, 라인이동 X
		System.out.print("Greeting Java!");
		System.out.print("Hey Java!");
		System.out.print("\n");	// 이스케이프 문자, new line
		
		// printf : 포맷 출력문
		System.out.printf("number : %d\n", 27);		// %d : decimal 숫자 출력
		System.out.printf("My Name is %s", "양지웅");	// %s : string 문자열 출력
	}

}
