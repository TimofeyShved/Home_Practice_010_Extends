package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


    }
}


class Shape{
    double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

class Pyramid extends Shape{
    double s, h;
}

class Box extends Shape{

    public void Box(double x){

    }

    public boolean add(Shape shape){

        return false;
    }
}

class SolidOfRevolution extends Shape{

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Cylinder extends SolidOfRevolution{
    double height;
}

class Ball extends SolidOfRevolution{

}