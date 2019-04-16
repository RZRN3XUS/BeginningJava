import java.util.*;
public class CoinCount {
    public static void main(String[] args){
        int quarters;
        int nickels;
        int dimes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of quarters");
        quarters = sc.nextInt();
        System.out.println("Enter number of dimes");
        dimes = sc.nextInt();
        System.out.println("Enter number of nickels");
        nickels = sc.nextInt();
        System.out.println("The dollar amount of these coins is $"+ (quarters*.25+dimes*.1+nickels*.05));
    }
}
