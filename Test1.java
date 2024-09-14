package test1;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      /*System.out.println("Enter Username: ");
        
        String user = scan.nextLine();
        System.out.println("Username is "+user);*/
      
      /*  System.out.println("Enter First Number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter operator (+,-,*,/): ");
        char operator = scan.next().charAt(0);
        System.out.println("Enter Second Number: ");
        double num2 = scan.nextDouble();
        
        double ans = 0;
        switch(operator){
            case '+':
                ans = num1 + num2;
                System.out.println("The Sum is "+ans);
                break; 
            case '-':
                ans = num1-num2;
                System.out.println("The Difference is "+ans);
                break;
            case '*':
                ans = num1*num2;
                System.out.println("The Product is "+ans);
                break;
            case '/':
                if(num2 != 0){
                    ans = num1/num2;
                    System.out.println("The Quotient is "+ans);
            }else{
                    System.out.println("Division by zero is not possible!");
                }
                break;
            default:
                System.out.println("Invalid Operator input! Please only use +,-,*,/");
        } */
        /*if(num1>=18){
            System.out.println("You are "+num1+" eligible to drive!");
        }else
            System.out.println("You are a "+num1+" and a Minor! Not eligible to drive!");
        */
        System.out.println("Enter your Full Name: ");
        String name = scan.nextLine();
        System.out.println("What year were you born?");
        int bday = scan.nextInt();
        int age = 2024 - bday;
        
        if(bday<2024){
            System.out.println("\nYou are "+name+"\nAnd you are "+age+" years old!");
        }else{
            System.out.println("\nInvalid Year!");
        }
     }  
}