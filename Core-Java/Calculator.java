import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 10;
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(a!=0)
                System.out.println(a/b);
            else
                System.out.println("Undefined");
                break;
            case '%':
                if(a!=0){
                    System.out.println(a%b);
                }
                else
                {
                    System.out.println("Undefined");
                }
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}

