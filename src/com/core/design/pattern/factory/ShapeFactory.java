package com.core.design.pattern.factory;

public class ShapeFactory {
   static Shape getInstance(String str) throws Exception{

        if (str=="Square")
            return new Square();

        if(str=="Rectangle")
            return new Rectangle();

        if (str==null)
            throw new RuntimeException("not found");
        return null;

    }
}
