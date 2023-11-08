/*
Jose Trevizo:
Description:
Program for Program 2 in CS2050
*/
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Program2 {

    // TODO #1: finish the method's implementation
    public static double add(double a, double b) {
        double addSum = a + b;
        return addSum;
    }
    // TODO #2: finish the method's implementation
    public static double subtract(double a, double b) {
        double subSum = a - b;
        return subSum;
    }

    // TODO #3: finish the method's implementation
    public static double multiply(double a, double b) {
        double mulSum = a * b;
        if(mulSum == -0){
        return 0;
        } else
            return mulSum;
    }

    // TODO #4: finish the method's implementation
    public static double divide(double a, double b) {
        if (b == 0){
            throw new ArithmeticException("Cannot Divide by zero");
        }
        double divSum = a / b;
        return divSum;
    }

    // TODO #5: finish the method's implementation - assume right triangle
    public static double sinOfAngle(double oppSide, double hyp) {
        double sinAngleCalc = oppSide/hyp;
        DecimalFormat df1 = new DecimalFormat(".##");
        String convert = df1.format(sinAngleCalc);
        double sinAngle = Double.parseDouble(convert);
        return sinAngle;
    }

    // TODO #6: finish the method's implementation - assume right triangle
    public static double hypOfTriangle(double sideA, double sideB) {
        double squares = Math.pow(sideA, 2) + Math.pow(sideB, 2);
        double sumHyp =Math.sqrt(squares);
        DecimalFormat df2 = new DecimalFormat(".##");
        String largeDecimal = df2.format(sumHyp);
        double hyp = Double.parseDouble(largeDecimal);
        return hyp;
    }
    public static void main(String[] args) {
    System.out.println("Enter first number/ Number A:");
    Scanner usrIn = new Scanner(System.in);
    double a = usrIn.nextDouble();
    System.out.println("Enter second number/ Number B ");
    double b = usrIn.nextDouble();
    add(a,b);
    subtract(a,b);
    multiply(a,b);
    divide(a,b);
    sinOfAngle(a,b);
    hypOfTriangle(a,b);
    }
}
