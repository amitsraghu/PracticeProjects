package com.amit.java.programs.staticKeyword.InnerClasses;

/*
Inner non static Class can not define any static members but It can access the static as well
as non static member of the Outer class.
 Question ::innerClass.showOuterClass(); Why

*/


public class OuterClass {

    private int x=10;
    public int  check=12;
    static int y=89;
    public void showOuterClass(){
        System.out.println("Access from Outer class "+y);
    }
    private void showOuterClassPrivate(){
        System.out.println(y);
    }
     class InnerClass{
        public  int  amit;
        int y=90;
        public  void showInnnerClass(){
           System.out.println("Outer Class x= "+x);
            System.out.println("Inner Class  y= "+y);
            System.out.println("Inner Class amit= "+amit);
            showOuterClass();
        }

    }
}
class Demo {
    public static void main(String args[]){
        OuterClass out=new OuterClass();
        out.showOuterClass();
        OuterClass.InnerClass innerClass=out.new InnerClass();

        innerClass.showInnnerClass();

    }
}