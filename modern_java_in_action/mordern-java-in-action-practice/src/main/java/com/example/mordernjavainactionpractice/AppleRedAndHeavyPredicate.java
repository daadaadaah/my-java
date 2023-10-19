package com.example.mordernjavainactionpractice;

import static com.example.mordernjavainactionpractice.Color.GREEN;
import static com.example.mordernjavainactionpractice.Color.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
