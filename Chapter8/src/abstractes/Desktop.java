package abstractes;

public class Desktop extends Computer {

	public void display() {
		System.out.println("데스크탑 입니다.");
	}

	public void typing() {
		System.out.println("데스크탑을 타이핑합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("데스크탑의 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("데스크탑의 전원을 끕니다.");
	}
	
}
