package sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
 * 날짜 : 2026/05/14
 * 이름 : 양지웅
 * 내용 : 11장 자바 컬렉션 맵 스트림 실습
 * */

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class MapStreamTest {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 25));
		persons.add(new Person("김춘추", 23));
		persons.add(new Person("장보고", 35));
		persons.add(new Person("강감찬", 45));
		persons.add(new Person("이순신", 55));
		
		System.out.println(persons);
		
		// mapXXX() - 하나의 원소를 다른 값으로 변환
		persons.stream()
				.map(p -> p.getName())
				.forEach(name -> System.out.print(name + ", "));
		System.out.println();
		
		int sum = persons.stream()
							.mapToInt(p -> p.getAge())
							.sum();
		System.out.println("sum : " + sum);
		
		// flatMapXXX() - 하나의 원소를 하나 이상 다른 값으로 변환
		List<String> cities = 
				List.of("서울,대전", "대구,부산", "광주,인천", "울산,수원", "양산,김해");
		System.out.println(cities);
		System.out.println(cities.size());
		
		List<String> resultList = cities.stream()
										.flatMap(c -> {
											String[] values = c.split(",");
											return Arrays.stream(values);
										})
										.collect(Collectors.toList());
		System.out.println(resultList);
		System.out.println(resultList.size());
	}

}
