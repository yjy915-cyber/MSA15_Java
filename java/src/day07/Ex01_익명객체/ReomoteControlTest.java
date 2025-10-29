package day07.Ex01_익명객체;

public class ReomoteControlTest {

	public static void main(String[] args) {
		// 익명 구현 객체
		// : 클래스를 정의하지 않고도, 이름없이 구현한 객체
		// - 인터페이스 객체명 = new 인터페이스( 인자1, ... ) { 객체 정의 }
		RemoteControl rc = new RemoteControl() {
			int speed = 0;
			@Override
			public void turnOff() {
				System.out.println("OFF");
			}
			
			@Override
			public void turnON() {
				System.out.println("ON");
			}
			
			@Override
			public void setSpeed(int speed) {
				this.speed = speed;
				System.out.println("속도 : " + this.speed);
			}
		};
		rc.turnON();
		rc.setSpeed(50);
		rc.turnOff();
	}
	
}
