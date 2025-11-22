


 class hyr {
    // variable
     static int currentBalance = 1000;




     public static void depositAmount(int amount){
           currentBalance = currentBalance +amount;
     }
     public static void withdrasAmount(int amount){
         currentBalance = currentBalance - amount;
     }

     public static int finalBalance (){

         return currentBalance;


     }

     public static void main(String[] args){

        //hyr obj = new hyr();
         System.out.println("your current balance is : "+ currentBalance);

         int depositvalue = 5000;
         depositAmount(depositvalue);
         System.out.println("your depositAmount is : "+ depositvalue);
         System.out.println("your total Balance is : "+ currentBalance);

         int withdrasValue = 2500;
         withdrasAmount(withdrasValue);
         System.out.println("your withdras amount is : "+ withdrasValue);
         System.out.println("Current Balance is : "+ currentBalance);





     }


}
