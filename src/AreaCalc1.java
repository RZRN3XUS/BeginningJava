import java.util.Scanner;

public class AreaCalc1 {
    /*
Christopher Dycus
March 20, 2019
Program - area of a circle
Version 1.0
 */


        public static void main(String[] args) {

            double radius;
            float PI = 3.14159265359f;
            double area;
            Scanner sc = new Scanner(System.in);

            System.out.println("Circle Area Calculator");
            System.out.println("Version 1.0");
            System.out.println("");
            System.out.println("Please input a radius");
            radius = sc.nextDouble();
            area = radius*radius*PI;
            System.out.println("The area of the circle with radius " +radius+ " is "+area+" units squared.");

        }
    }

