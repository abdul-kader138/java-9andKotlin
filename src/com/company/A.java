package com.company;

@FunctionalInterface
public interface A {


    /* private method at Interface   */
    private int newPrivateFeatures(int a) {
        return 2;
    }


    default void tesPrivate() {
        System.out.println(newPrivateFeatures(10));
    }

    void a();


}
