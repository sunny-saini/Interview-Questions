package com.core;

public class ArraySyntax {
    int a;
    int b;
    public ArraySyntax(int a, int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        ArraySyntax g = new ArraySyntax(2,5).getNum();
        System.out.println(g.a);
        System.out.println(g.b);
    }
    public ArraySyntax getNum(){
        return new ArraySyntax(a/b,a*b);
    }

    @Override
    public String toString() {
        return "ArraySyntax{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
