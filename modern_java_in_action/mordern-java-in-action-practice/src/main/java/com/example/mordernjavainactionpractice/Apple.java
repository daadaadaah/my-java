package com.example.mordernjavainactionpractice;

public class Apple {

    private int weight = 0;

    private Color color = Color.GREEN;

    public Apple(int weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return "Apple{" +
            "color='" + color + '\'' +
            ", weight=" + weight +
            '}';
    }
}
