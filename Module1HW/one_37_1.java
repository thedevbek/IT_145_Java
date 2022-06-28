import java.util.Scanner; 

public class one_37_1 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;
      int userNum1 = 0;
      
      System.out.println("Enter integer: ");
      userNum = scnr.nextInt();
      
      System.out.println("You entered: " + userNum);
      System.out.println(userNum + " squared is " + userNum * userNum);
      System.out.println("And " + userNum + " cubed is " + userNum*userNum*userNum + "!!");
      
      System.out.println("Enter another integer: "); 
      userNum1 = scnr.nextInt();
      System.out.println(userNum + " + " + userNum1 + " is " + (userNum + userNum1));
      System.out.println(userNum + " * " + userNum1 + " is " + userNum * userNum1);
      return;
   }
}