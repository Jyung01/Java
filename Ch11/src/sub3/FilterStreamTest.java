package sub3;

import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2026/05/14
 * 이름 : 양지웅
 * 내용 : 11장 자바 컬렉션 필터 스트림 실습
 * */


public class FilterStreamTest {

	public static void main(String[] args) {
		
		// 불변 리스트 생성 (수정 불가능)
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		
		numbers.stream().forEach(n -> System.out.print(n + ", "));
		System.out.println();
		
		//numbers.add(8) -> 불변 리스트 이므로 새로운 값 추가 불가능
		
		// 중복제거
		numbers.stream()
				.distinct()
				.forEach(num -> System.out.print(num + ", "));
		System.out.println();
		
		// 5 보다 큰 데이터 필터링
		numbers.stream()
				.filter(num -> num > 5)
				.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		
		// 중복제거, 짝수 데이터 필터링, 내림차순 정렬
		numbers.stream()
				.distinct()
				.filter(n -> n % 2 == 0)
				.sorted(Collections.reverseOrder())
				.forEach(n -> System.out.print(n + ", "));
	}

}
