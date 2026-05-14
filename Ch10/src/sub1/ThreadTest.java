package sub1;

/*
 * 날짜 : 2026/05/14
 * 이름 : 양지웅
 * 내용 : 10장 자바 스레드(Thread) 실습
 * */

public class ThreadTest {

	public static void main(String[] args) {
		
		// 스레드 객체 생성
		ChildThread ct1 = new ChildThread();
		ChildThread ct2 = new ChildThread();
		
		ct1.setName("Chil1");
		ct2.setName("Chil2");
		
		// 자식 스레드 실행
		ct1.start();
		ct2.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("Main - 스레드 실행");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		System.out.println("Main thread 종료..");

	}

}
