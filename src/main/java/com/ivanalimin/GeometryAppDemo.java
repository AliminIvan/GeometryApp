package com.ivanalimin;

import com.ivanalimin.geometry.Circle;
import com.ivanalimin.geometry.Rectangle;
import com.ivanalimin.geometry.Triangle;

/*
 В проекте "GeometryApp" создайте приложение, которое использует библиотеку "GeometryLibrary".
 Создайте объекты различных геометрических фигур, выведите информацию о их площади и периметре.
 */
public class GeometryAppDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(1, 1, 10);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}
