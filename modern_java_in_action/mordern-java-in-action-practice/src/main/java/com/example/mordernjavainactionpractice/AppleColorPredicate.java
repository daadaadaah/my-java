package com.example.mordernjavainactionpractice;

import static com.example.mordernjavainactionpractice.Color.GREEN;

public class AppleColorPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return GREEN.equals(apple.getColor());
    }
}
