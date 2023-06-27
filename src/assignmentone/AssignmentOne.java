/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentone;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class AssignmentOne {

static double Sum(double x, double y)
{
double sum = x+y;
return sum;

}

static double Difference(double x, double y)
{
double Difference  = x-y;
return Difference;

}

static double Product(double x, double y)
{
double Product = x*y;
return Product;

}

static double Quotient(double x, double y)
{
double Quotient = x/y;
return Quotient;

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner s = new Scanner(System.in);
String answer;
String ans = "Y";
double a, b;
do{
System.out.println("What operation would you wish to perform?\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
answer = s.next();

System.out.println("Enter first number");
a = s.nextInt();
System.out.println("Enter second number");
b = s.nextInt();


if (answer.equals("1"))
{
double S  = Sum(a, b);
System.out.println("The sum is:" + S);
}

if (answer.equals("2"))
{
double D  = Difference(a, b);
System.out.println("The sum is:" + D);
}

if (answer.equals("3"))
{
double P  = Product(a, b);
System.out.println("The sum is:" + P);
}

if (answer.equals("4"))
{
double Q  = Quotient(a, b);
System.out.println("The sum is:" + Q);
}


System.out.println("Would you wish to perform another operation?(Y/N)");
ans = s.next();


    }while(ans.equals("Y"));
    
}
}