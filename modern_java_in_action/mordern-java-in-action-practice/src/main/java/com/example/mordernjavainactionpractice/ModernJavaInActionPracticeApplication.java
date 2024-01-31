package com.example.mordernjavainactionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModernJavaInActionPracticeApplication {

	public static void main(String[] args) {
		getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);
	}

	// Java 7
	public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes){
		List<Dish> lowCaloricDishes = new ArrayList<>();

		// 누적자로 요소 피러링 : 400 이하의 요리 담기
		for(Dish d: dishes){
			if(d.getCalories() < 400){
				lowCaloricDishes.add(d);
			}
		}

		// 익명 클래스로 요리 정렬 : 칼로리 순으로 정렬
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2){
				return Integer.compare(d1.getCalories(), d2.getCalories());
			}
		});

		// 정려된 리스트를 처리하면서 요리 이름 선택 : 요리 이름만 담기
		List<String> lowCaloricDishesName = new ArrayList<>();
		for(Dish d: lowCaloricDishes){
			lowCaloricDishesName.add(d.getName());
		}

		return lowCaloricDishesName;
	}
}
