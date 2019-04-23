import java.util.*;
public class Testchapter3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a date > ");
        String date = scan.nextLine();
        char monthLetter = date.charAt(0);
        monthLetter = Character.toLowerCase(monthLetter);
        String day  = date.substring(date.indexOf(" ")+1, date.indexOf(","));
        String year = date.substring(date.indexOf(",")+2);
        System.out.println(monthLetter);
        System.out.println(day);
        System.out.println(year);
    }
}