import java.util.Scanner;
/**
 * @author Ziad Alawak
 **/
public class Main {
    public static void main(String[] args) {
        /*
         * Write a Java program that calculates the area and circumference of a circle.
         * The program should prompt the user to enter the radius of the circle and then
         * display the calculated values.
         */
        System.out.println("please enter the r: ");
        int r = new Scanner(System.in).nextInt();
        System.out.println("the area is : " + area(r)+"m^2");
        System.out.println("and the Circumference is:" + Circumference(r)+"m");

    }

    public static double area(int r) {
        return (Math.PI * r * r);

    }

    public static double Circumference(int r) {

        return (2 * Math.PI * r);
    }
}