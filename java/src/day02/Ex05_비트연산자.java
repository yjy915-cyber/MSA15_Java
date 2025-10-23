package day02;

public class Ex05_비트연산자 {

	public static void main(String[] args) {
		// AND
		int result = 20 & 16;
		System.out.println("20 & 16 + " + result);
		// Intger.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("--------" );
		System.out.println( Integer.toBinaryString(result) );
		System.out.println();
		
		// OR
		int result2 = 20 | 16;
		System.out.println("20 | 16 + " + result2);
		// Intger.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("--------" );
		System.out.println( Integer.toBinaryString(result2) );
		System.out.println();
		
		// XOR
		// : 서로 값이 다르면 1(true), 같으면 0(false)
		int result3 = 20 ^ 16;
		System.out.println("20 ^ 16 + " + result3);
		// Intger.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("--------" );
		System.out.println( Integer.toBinaryString(result3) );
		System.out.println();
		
		// 왼쪽 시프트 연산 (<<)
		int a = 5;
		int result4 = a << 1;
		System.out.println(result4);
		
		// 오른쪽 시프트 연산 (>>)
		int b = 5;
		int result5 = b >> 1;
		System.out.println(result5);
	}
}
