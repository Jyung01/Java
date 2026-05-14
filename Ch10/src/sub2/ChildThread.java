package sub2;

public class ChildThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + "Main - 스레드 실행");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + " - 스레드 종료...");
	}
	
}
