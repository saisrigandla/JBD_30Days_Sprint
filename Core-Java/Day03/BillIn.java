import java.util.Scanner;

public class BillIn {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    System.out.print("Enter the quantity :");
    int quantity=sc.nextInt();
     System.out.print("Enter the price :"); 
     double price=sc.nextInt();
     double total = quantity*price;
     System.out.println("Total :"+total);
sc.close();
     
    }
   

}
