package Test2;
import java.util.Scanner;

public class Calculator extends Calculation {
    public void division(int a,int b){
        int d= a/b;
        int g=a%b;
        System.out.println("The quotient of the division is "+d);
        System.out.println("The divide remaining of numbers is "+g);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter two integers for calculation: ");
        System.out.println("Number 1: ");
        int a=input.nextInt();
        System.out.println("Number 2: ");
        int b=input.nextInt();
        Calculator obj=new Calculator();
        obj.addition(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);


    }
}
