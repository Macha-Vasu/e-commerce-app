package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Maina {
//    static void main() {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        IO.println(String.format("Hello and welcome!"));
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            IO.println("i = " + i);
//        }
//    }
//}

class Main {
      static int currentBalance;

      void depositAmount(int amount){
         currentBalance = currentBalance + amount;
        // System.out.println("Deposit Amount is :"+currentBalance);

     }
     public void withdras(int amount){
         currentBalance = currentBalance - amount;
     }
     public int finalBalance(){
        return currentBalance;
     }



//    String name = "vasu";
//    int age = 30;
//    int salary = 100000;

    public static void main (String []args ){

//        System.out.println("Before variable print");
//        Main obj = new Main();
//        System.out.println("My name is : " + obj.name);
//        System.out.println("My age is : "+obj.age);
//        System.out.println("My salary is : "+obj.salary);
//        System.out.println("All tasks done");

        Main obj = new Main();
        System.out.println("Initial Balance "+currentBalance);
        int withdrasValue = 9000;
        int depositValue =15000;
        obj.depositAmount(depositValue);
        //obj.withdras(1500);
        System.out.println("Deposit Amount is : "+ depositValue);
        System.out.println("your current balance is : "+currentBalance);


        obj.withdras(withdrasValue);
        System.out.println("withdras amount is : "+ withdrasValue);
        //System.out.println("Withdras Amount is :"+withdrasValue);
        System.out.println("Final Balance is :"+ obj.finalBalance());

    }
}