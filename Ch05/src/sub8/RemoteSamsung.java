package sub8;

public class RemoteSamsung implements RemoteControl {

	public void powerOn() {
		System.out.println("SAMSUNG - power on");
	}

	@Override
	public void powerOff() {	
		System.out.println("SAMSUNG - power off");
	}

	@Override
	public void chUp() {	
		System.out.println("SAMSUNG - channel up");
	}

	@Override
	public void chDown() {	
		System.out.println("SAMSUNG - channel down");
	}

	@Override
	public void soundUp() {	
		System.out.println("SAMSUNG - sound up");
	}

	@Override
	public void soundDown() {	
		System.out.println("SAMSUNG - sound down");
	}

}
