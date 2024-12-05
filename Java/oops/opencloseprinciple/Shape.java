package com.anu.learning.oops.opencloseprinciple;

public interface Shape {
    public void draw();
}

class Triangle implements Shape{

    @Override
    public void draw() { System.out.println("Triangle is being drawn"); }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle is being drawn");
    }
}

class circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle is being drawn");
    }
}
