package day04.Ex03_메소드;

/**
 * 계산기
 * - 피연산자를 2개로 하는 계산기
 * - 기능
 *      1. 덧셈   	 : 정수 2개를 덧셈
 *      2. 뺄셈       : 정수 인자1 - 인자2 연산을 하는 뺄셈
 *      3. 곱셈       : 실수 2개를 곱셈
 *      4. 나눗셈  	 : 실수 인자1 / 인자2 연산을 하는 나눗셈
 *      5. 나머지      : 정수 인자1 % 인자2 연산을 하는 나눗셈
 *      6. 합계       : 배열로 매개변수를 전달받아, 모든 요소의 합계를 구함
 *      7. 평균       : 배열로 매개변수를 전달받아, 모든 요소의 평균을 구함
 * 
 *      * 메소드명
 *      : plus, minus, multiple, divide, remain, sum, avg
 */
public class Calculator {

	public String result;

	// 덧셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
		
	// 뺄셈
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	// 곱셈
	public double multiple(double a, double b) {
		double multiple = a * b;
		return multiple;
	}
	
	// 나눗셈
	public double divide(double a, double b) {
		double divide =  a / b;
		return divide;	
	}
	
	// 나머지
	public double remain(double a, double b) {
		double result = a % b;
		return result;	 
	}
	 
	 // 합계
	public int sum(int[] arr) {
		int sum = 0 ;
		for (int i : arr) 
			sum += i;
		return sum;
	}
	
	// 평균
	public double avg(int[] arr) {
		// 방법1
//		int sum = 0 ;
//		for (int i : arr)
//			sum += i;
//		double avg = (double) sum / arr.length;
		// 방법2
		double avg = (double) sum(arr) / arr.length;
		return avg;
	}
	
}