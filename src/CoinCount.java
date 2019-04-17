/*
Christopher Dycus
Takes number of quarters dimes and nickels
Gets dollar amount
4/16/2019
 */
import java.util.*;
public class CoinCount {
    public static void main(String[] args){
        int quarters;
        int nickels;
        int dimes;
        double value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of quarters");
        quarters = sc.nextInt();
        System.out.println("Enter number of dimes");
        dimes = sc.nextInt();
        System.out.println("Enter number of nickels");
        nickels = sc.nextInt();
        value = quarters*0.25+nickels*0.05+dimes*0.1;
        System.out.print("The dollar amount of these coins is $");
        System.out.printf("%.2f%n" , value);
    }
}
