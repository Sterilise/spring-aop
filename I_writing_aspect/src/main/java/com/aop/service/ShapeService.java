package com.aop.service;

import com.aop.model.Circle;
import com.aop.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle cirle) {
        this.circle = cirle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
