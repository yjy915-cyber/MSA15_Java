package day06.Ex04_중첩인터페이스;

// 아우터 클래스
public class I {

	// 인터페이스 선언
	J j;
	
	// 중첩 인터페이스 정의
	// * 중첩 인터페이스에 static 생략하면, 컴파일러가 자동으로 추가한다.
	static interface J {
		void methodA();
		void methodB();
	}
	
	void method() {
		j.methodA();
		j.methodB();
	}
	
	public void setInterface(J j) {
		this.j = j;
	}
}
