/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

/**
 *
 * @author Admin
 */
public class Circle {

    private double radius;
    private String color;
   private  static  final float PI = 3.14f;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected double getArea() {
      return PI * Math.pow(radius, 2);
    }

    public Circle(double radius, String color, double Area) {
        super();
        this.radius = radius;
        this.color = color;

    }
}

public class Cylinder extends Circle {

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color, radius);
    }

    protected double getVolume() {
        return getArea() * height;
    }
}
