import java.util.Scanner;
public class FinalBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Price :");
        double price=sc.nextDouble();
        double dis10=price*10.0/100;
        double dis5=price*5.0/100;
        boolean isMember=true;
        double total10=price-dis10;
        double total5=price-dis5;
        if(price > 1000){
            System.out.println(total10);

        }
        else if(price> 500){
            System.out.println(total5);
        } 
        else{
        System.out.println("No Discount!");
        }
        sc.close();
      
    }
}
