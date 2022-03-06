package Test4;
import java.util.Scanner;

public class Test implements MyInteger {

    //overriding the abstract methods of MyInteger
    @Override
    public void isEven(int a) {
        if(a%2==0){
            System.out.println(a+" is Even");
        }else System.out.println(a+" is not Even");
    }

    @Override
    public void isOdd(int a) {
        if(a%2!=0){
            System.out.println(a+" is Odd");
        }else System.out.println(a+" is not Odd");
    }

    @Override
    public void isPositive(int a) {
        if(a>0) System.out.println(a+" is positive");
        else System.out.println(a+" is not positive");

    }

    @Override
    public void isNegative(int a) {
        if(a<0) System.out.println(a+" is Negative");
        else System.out.println(a+" is not Negative");
    }

    @Override
    public void isZero(int a) {
        if(a==0) System.out.println(a+" is Zero");
        else System.out.println(a+" is not Zero");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an Integer: ");
        int x=input.nextInt();
        Test test=new Test();
        test.isEven(x);
        test.isOdd(x);
        test.isPositive(x);
        test.isNegative(x);
        test.isZero(x);

    }
}
