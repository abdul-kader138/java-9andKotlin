package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> add = List.of("Babu", "Babu1");
        add.forEach(System.out::println);

        A a=new A() {
            @Override
            public void a() {
                System.out.println("t");
            }
        };
        a.a();
        a.tesPrivate();

        System.out.println(ProcessHandle.current().pid());
    }
}
