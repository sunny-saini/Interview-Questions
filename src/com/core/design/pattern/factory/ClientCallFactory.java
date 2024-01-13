package com.core.design.pattern.factory;

public class ClientCallFactory {
    public static void main(String[] args) throws Exception {
        Shape syso = ShapeFactory.getInstance("Square");
        System.out.println(syso.getArea());
    }
}
