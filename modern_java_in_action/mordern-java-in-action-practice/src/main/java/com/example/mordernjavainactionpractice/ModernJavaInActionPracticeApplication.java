package com.example.mordernjavainactionpractice;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModernJavaInActionPracticeApplication {

	public static void main(String[] args) {
		getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
	}

	// Java 8
	public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
		return dishes.parallelStream()
			.filter(d -> d.getCalories() < 400) // 400 이하의 요리 담기
			.sorted(comparing(Dish::getCalories)) // 칼로리 순으로 정렬
			.map(Dish::getName) // 요리 이름만 담기
			.collect(toList());
	}
}
