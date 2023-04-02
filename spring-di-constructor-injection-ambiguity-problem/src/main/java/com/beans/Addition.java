package com.beans;


import com.sun.jdi.IntegerType;

public class Addition {
    int a;
    int b;

    public Addition() {
    }
    public Addition(double a, double b) {
        System.out.println("Double");
        this.a = (int) a;
        this.b = (int) b;
    }
    public Addition(int a, int b) {
        System.out.println("int");
        this.a = a;
        this.b = b;
    }
    public Addition(String a, String b) {
        System.out.println("Double");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }


    public void sum() {
        System.out.println(this.a + this.b);
    }
}
