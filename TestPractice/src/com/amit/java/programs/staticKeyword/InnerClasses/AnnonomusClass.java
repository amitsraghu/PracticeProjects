package com.amit.java.programs.staticKeyword.InnerClasses;
/*
* This Class should Always define as inner class
* Can Define as ::
* 1.By Interface methods definition.
* 2.By class or extends class method definition.
* 3.As a Constructor of another Class.
  Class file can be generated as SuperClass$InnerClass
 */

interface Readable{
    int  pageNumber=9;
    void m1();
}

public class AnnonomusClass {

    public static void main(String[] args) {

        //First By Interface
        Readable rd =new Readable() {
          @Override
          public void m1(){
              System.out.println(pageNumber);
          }
        };

        //Extend class Instance
        Thread th =new Thread() {
            public void  run(){
                System.out.println("amit Singh run Thread");
            }
        };

        th.start();

        //BY Constructor
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("amit Singh Constor");
            }
        });


    }
}
