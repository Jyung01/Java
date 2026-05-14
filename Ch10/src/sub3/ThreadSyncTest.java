package sub3;

/*
 * 날짜 : 2026/05/14
 * 이름 : 양지웅
 * 내용 : 10장 자바 스레드(Thread) 동기화 실습
 */

public class ThreadSyncTest {

	public static void main(String[] args) {
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		try {
			ct1.join();
			ct2.join();
			ct3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("count : " + count.getNum());

	}
}

