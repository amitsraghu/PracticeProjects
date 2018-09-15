package com.amit.java.programs.OverriddingClass;
/*
*  Private methods are not available for overriding
*  Can not Override the static methods
*
 */
class Super{

    private   
    private void showPrivate(){
        System.out.println("Private of  Super ");
    }
    void  display(){
        System.out.println("Displaying Super");
    }
}

class OverriddingPrivateStaticTest extends Super{
    private  void  showPrivate(){
        System.out.println("Private Subclass");
    }
    void  display(){
        System.out.println("Displaying Subtype");
    }
    void  nonOverWriddingMethod(){
        System.out.println("Non overridding Method ");
    }

    public static void main(String[] args) {

        Super su =new OverriddingPrivateStaticTest();
        ((OverriddingPrivateStaticTest) su).showPrivate();
        su.display();
        ((OverriddingPrivateStaticTest) su).nonOverWriddingMethod();
    }
}

