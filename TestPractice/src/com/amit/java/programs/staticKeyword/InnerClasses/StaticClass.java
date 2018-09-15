package com.amit.java.programs.staticKeyword.InnerClasses;
/*
*  Static class Can only access the static member of the Outer class.
*  Can Define static as well as non static member
*  Can access the Outer class member by reference of the Outer Class.
 */


class Subclass1{
    private int x ;
    public static int y;

    void outerM1(){
        System.out.println(x);
        System.out.println(y);
    }
    static void outerM2(){
        int x=0;
        System.out.println(y);
        System.out.println(x);
    }
    static class Subclass2{
        int innner1;
        static int inner2;
        void m1(){
            System.out.println(inner2);
            System.out.println(y);
            outerM2();
        }
        static void m2(){
            System.out.println(inner2);
            System.out.println(y);
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Subclass1  s1=new Subclass1();
        Subclass1.Subclass2.inner2=6;
        Subclass1.Subclass2  sub=new Subclass1.Subclass2();
        sub.m2();
        //Subclass1.Subclass2 sub1=s1.new Subclass2();

    }
}
