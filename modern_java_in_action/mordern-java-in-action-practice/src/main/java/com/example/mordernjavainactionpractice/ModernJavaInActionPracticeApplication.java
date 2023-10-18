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
}
