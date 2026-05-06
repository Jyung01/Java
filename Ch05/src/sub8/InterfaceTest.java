package sub8;

/*
 * 날짜 : 2026/05/06
 * 이름 : 양지웅
 * 내용 : 5장 자바 인터페이스 실습
 * */

public class InterfaceTest {

	public static void main(String[] args) {
		// 인터페이스 활용1 : 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG();	// 다형성 (업캐스팅)
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		lg.powerOff();

		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		samsung.powerOff();
		
		// 인터페이스 활용2 : 모듈간 결합도 완화(유연성)
		Bulb bulb = new Bulb();
		Socket socket = new PowerCable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 활용3 : 다중 상속 효과
		SmartTV stv = new SmartTV();
		
		stv.powerOn();
		stv.connection();
		stv.chUp();
		stv.surf();
		stv.process();
		stv.save();
		
	}

}
