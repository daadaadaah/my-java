package com.example.mordernjavainactionpractice;

import static com.example.mordernjavainactionpractice.Color.GREEN;
import static com.example.mordernjavainactionpractice.Color.RED;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModernJavaInActionPracticeApplication {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, GREEN), new Apple(155, GREEN), new Apple(120, RED));

		List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
		System.out.println(greenApples); // [Apple{color='GREEN', weight=80}, Apple{color='GREEN', weight=155}]

		List<Apple> redApples = filterApplesByColor(inventory, RED);
		System.out.println(redApples); // [Apple{color='RED', weight=120}]

		List<Apple> weight130Apples = filterApplesByWeight(inventory, 130);
		System.out.println(weight130Apples); // [Apple{color='GREEN', weight=155}]

		// 초록색 사과만
		List<Apple> greenApples2 = filterApples(inventory, new AppleColorPredicate());
		System.out.println(greenApples2); // [Apple{color='GREEN', weight=80}, Apple{color='GREEN', weight=155}]

		// 무거운 사과만
		List<Apple> heavyApples = filterApples(inventory, new AppleWeightPredicate());
		System.out.println(heavyApples); // [Apple{color='GREEN', weight=155}]

		// 빨간색이면서 무거운 사과만
		List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
		System.out.println(redAndHeavyApples); // []

		List<Apple> redApples2 = filterApples(inventory, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				return RED.equals(apple.getColor());
			}
		});

		System.out.println(redApples2); // [Apple{color='RED', weight=120}]
	}

	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color){
		List<Apple> result = new ArrayList<>();

		for(Apple apple: inventory){
			if(color.equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight){
		List<Apple> result = new ArrayList<>();

		for(Apple apple: inventory){
			if(apple.getWeight() > weight){
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
