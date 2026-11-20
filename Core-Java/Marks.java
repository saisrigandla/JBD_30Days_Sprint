import java.util.Scanner;
public class Marks {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1 to see score message, 0 to stop!");
    int n = sc.nextInt();
    System.out.println("Enter Marks!");
    int Marks = sc.nextInt();
    switch(n){
    case 0:
        System.out.println("Enter 1 to see score message!");
    break;
    case 1:
        if(Marks>=90){
        System.out.println("This is Good");
    }
    else if (89>=Marks&&Marks>=60) {
        System.out.println("This is also Good");
        
    }
    else if(59>=Marks&&Marks>=0){
        System.out.println("This is Good as well");
    }
break;
default:
    System.out.println("Enter 1 to see score message, 0 to stop!");

    sc.close();
  }  
  }
}
