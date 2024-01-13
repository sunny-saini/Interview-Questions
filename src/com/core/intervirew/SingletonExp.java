package com.core.intervirew;

public class SingletonExp {
    private static SingletonExp singletonExp =null;

    private SingletonExp(){}// new SingletonExp();

    public static  SingletonExp getInstance() { // T1 , T2

        if (singletonExp == null) {

            synchronized (SingletonExp.class) {
                if (singletonExp == null) {
                   singletonExp= new SingletonExp();
                }
            }

        }

        return singletonExp;
    }

}
