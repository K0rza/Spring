package com.example;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.of(new Circle(10), new Rectangle(5, 10), new Rectangle(5, 5))
            .forEach(x -> System.out.println(calcArea(x)));

    }

    private static String calcArea(Shape shape) {
        return switch (shape) {
            case Circle(int r) -> "The area of circle("+ r + ") = " + Math.PI * r * r;
            case Rectangle(int x, int y) when x!=y -> "The area of Rectangle(" + x + ", " + y + ") = " + x*y;
            case Rectangle(int x, int y) when x==y -> "The area of Square(" + x + ") = " + x*x;
            default -> "Undefined shape";
        };
    }

    interface Shape {}

    record Circle (int r) implements Shape {}
    record Rectangle(int x, int y ) implements Shape {}

}