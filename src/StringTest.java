import java.util.*;
public class StringTest {
    public static void main(String[] args){
        String fullname;
        String firstname;
        int space;
        int length;
        String lastname;
        String capitalname;
        String diddy = "Diddy";
        String izzle = "-izzle";
        char initial;
        int zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name, playa:");
        fullname = sc.nextLine();
        space = fullname.indexOf(" ");
        firstname = fullname.substring(0, space);
        length = fullname.length();
        lastname = fullname.substring(space+1, length);
        initial = fullname.charAt(zero);
        capitalname = lastname.toUpperCase();
        System.out.println("Your gansta name is \""+initial+". "+diddy+" "+capitalname+" "+firstname+izzle+"\"");
    }
}
