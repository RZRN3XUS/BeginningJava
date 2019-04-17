/*
Christopher Dycus
Slice email username and domain
4/16/2019
 */
import java.util.*;
public class EmailRead {
    public static void main(String[] args){
        String address;
        String domain;
        String user;
        int sign;
        int length;
        char at = '@';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address");
        address = sc.nextLine();
        sign = address.indexOf(at);
        user = address.substring(0 , sign);
        length = address.length();
        domain = address.substring(sign+1, length);
        System.out.println("User: "+user);
        System.out.println("Domain: "+domain);
    }
}
