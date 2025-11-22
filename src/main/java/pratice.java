
import java.util.Scanner;




public class pratice {

    static int initialAmount = 1000;

    public void depositAmount (int amount){
        initialAmount = initialAmount + amount;
    }
    public void withdrasAmount (int amount){
        initialAmount = initialAmount - amount;
        //return initialAmount;
    }
    public int finalAmount (int amount){
        return initialAmount;
    }
    public static void main(String[] args){

        pratice pc = new pratice();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your deposit amount :");
        int depositValue = sc.nextInt();
        System.out.println("Enter your withdras amount :");
        int withdrasValue = sc.nextInt();

        System.out.println("your initialamount is :"+initialAmount);

        pc.depositAmount(depositValue);
        System.out.println("your deposit amount is : "+ depositValue);
        System.out.println("your current Balance is :"+ initialAmount);

        pc.withdrasAmount(withdrasValue);
        System.out.println("your withdras amount is : "+withdrasValue);
        //System.out.println("your current balance is "+initialAmount);

        System.out.println("your final balance is : "+ initialAmount);
    }

}
