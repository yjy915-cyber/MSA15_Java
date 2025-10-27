package Ex02_인터페이스;

public class Driver {

	public static void main(String[] args) {
		// 인터페이스를 구현한 클래스 객체를 만드는 법
		// - 인터페이스타입 객체명 = new 구현클래스();
		
		// RC카
		RemoteControl carRC = new RcCar();
		carRC.turnON();				// 시동 걸기
		carRC.parking(false);		// 주행 모드
		carRC.setSpeed(20);			// 가속
		carRC.parking(true);		// 주차
		carRC.turnOff();			// 시동 끄기
		System.out.println();		
		
		// static 메소드는 객체 생성 없이도 바로 호출 가능
		RemoteControl.changeBattery();  // 베터리 교체
		System.out.println();
		
		// 드론
		RemoteControl droneRc = new Drone();
		droneRc.turnON();
		// 디폴트 메소드는 구현하지 않아도(오버라이딩) 바로 호출 가능
		droneRc.parking(false);
		droneRc.setSpeed(15);
		droneRc.parking(true);
		droneRc.turnOff();
		System.out.println();
	}
	
}
