package com.core.java8;

public interface Anonymous {
    int x=67;
  void go();


}

class Anony{
    public static void main(String[] args) {
        Anonymous au= new Anonymous() {
            @Override
            public void go() {
                System.out.println("x "+67);
            }
        };
        au.go();
    }
}
