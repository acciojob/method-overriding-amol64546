package com.driver;

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    public String meth(){
        return "Method is overridden in Extended class B";
    }
}
public class Main {

    public static void main(String[] args) {
        A b1 = new B();
        b1.meth();
        b1.meth();
    }
}