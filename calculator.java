import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        double n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/):");
        char op = sc.next().charAt(0);
        double o = 0;
        switch (op) {
            case '+':
                o = n1 + n2;
                break;
            case '-':
                o = n1 - n2;
                break;
            case '*':
                o = n1 * n2;
                break;
            case '/':
                o = n1 / n2;
                break;
            default:
                System.out.println("You enter wrong input");
        }
        System.out.println("The final result:");
        System.out.println();
        System.out.println(n1 + " " + op + " " + n2
                + " = " + o);
    }
}