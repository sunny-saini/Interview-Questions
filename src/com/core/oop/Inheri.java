package com.core.oop;

public class Inheri implements Multi1,Multi2{
    @Override
    public void cat() {
        System.out.println("cat1");
    }
}

class Child2 extends Inheri{

    @Override
    public void cat(){
        System.out.println("cat2");
    }

}

class Test{
    public static void main(String[] args) {
        Multi2 m= new Inheri();

    }
}

