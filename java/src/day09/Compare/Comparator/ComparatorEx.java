package day09.Compare.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product implements Comparator<Product> {
	
	String code;		// 상품코드
	String name;		// 상품명
	int price;			// 가격
	
	@Override
	public int compare(Product o1, Product o2) {
		// 1. 가격순으로 내림차순
		// 2. 이름순으로 오름차순
		int price1 = o1.getPrice();
		int price2 = o2.getPrice();
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		// 방법 1
		// 가격순 (내림)
//		if( price1 > price2 ) return -1;
//		if( price1 < price2 ) return 1;
//		if( price1 == price2 ) {
//			// 이름순 (오름)
//			int gap = name1.compareTo(name2);
//			// name1 이 더 크면 (사전순으로 뒤에 나오면) (+)
//			// name1 이 더 작으면 (사전순으로 앞에 나오면) (-)
//			// name1 와 name 이 같으면 (같은 문자열이면) (0)
////			if ( gap > 0 ) return 1;
////			if ( gap < 0 ) return -1;
////			if ( gap == 0 ) return 0;
//			return gap;	
//		}
//		return 0;
		
		// 방법 2
		int result1 = price2 - price1;			// 가격순 (내림)
		int result2 = name1.compareTo(name2);	// 이름순 (오름)
		return result1 == 0 ? result2 : result1;
		
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
			new Product("PRD001", "과자", 4000),	
			new Product("PRD002", "바지", 40000),	
			new Product("PRD003", "패딩", 100000),	
			new Product("PRD004", "셔츠", 15000),	
			new Product("PRD005", "우유", 4000),	
			new Product("PRD006", "젤리", 4000)	
		);
		
		// 정렬 전
		System.out.println("정렬 전");
		for (Product product : productList) {
			System.out.println(product);
		}
		System.out.println();
		
		// 정렬
		Collections.sort( productList, new Product() );
		
		// 정렬 후
		System.out.println("정렬 후");
		for (Product product : productList) {
			System.out.println(product);
		}
		System.out.println();
		
	}
}
