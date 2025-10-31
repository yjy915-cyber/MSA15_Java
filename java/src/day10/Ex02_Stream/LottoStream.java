package day10.Ex02_Stream;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임 : ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + "게임] : ");
			Set<Integer> set = new HashSet<Integer>();
			while ( set.size() < 6 ) {
				int rand = (int) (Math.random() * 45 + 1);
				set.add( rand );
			}
			// 스트림을 이용하여 정렬 + 출력
			set.stream()
			   .sorted()
			   .forEach( lotto -> System.out.print(lotto + " ") );
			System.out.println();
		}
		sc.close();
	}
}
