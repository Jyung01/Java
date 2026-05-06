package sub8;

// 인터페이스를 구현하는 클래스
public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG - power on");
	}

	@Override
	public void powerOff() {	
		System.out.println("LG - power off");
	}

	@Override
	public void chUp() {	
		System.out.println("LG - channel up");
	}

	@Override
	public void chDown() {	
		System.out.println("LG - channel down");
	}

	@Override
	public void soundUp() {	
		System.out.println("LG - sound up");
	}

	@Override
	public void soundDown() {	
		System.out.println("LG - sound down");
	}

}
