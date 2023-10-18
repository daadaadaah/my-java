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

		List<Apple> greenApples = filterGreenApples(inventory);
		System.out.println(greenApples); // [Apple{color='GREEN', weight=80}, Apple{color='GREEN', weight=155}]
	}

	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();

		for(Apple apple: inventory){
			if(GREEN.equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
}
