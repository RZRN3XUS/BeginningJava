import java.util.*;
public class Conversions {
    public static void main(String[] args) {
        String input;
        String hex1 = "Hex";
        String hex2 = "hex";
        String hex3 = "Hexadecimal";
        String hex4 = "hexadecimal";
        Scanner read = new Scanner(System.in);
        System.out.println("Convert between Hex, Binary, and Decimal. Please enter unit that is being converted from.");
        input = read.nextLine();
        if (input.equals(hex1)) {
            hexpre(input);
        } else if (input.equals(hex2) ) {
            hexpre(input);
        } else if (input.equals(hex4)) {
            hexpre(input);
        } else if (input.equals(hex3)){
            hexpre(input);
    }


        }
    public static void hexpre(String input){
        Scanner sc = new Scanner(System.in);
        int value;
        String input2;
        String hex1 = "Hex";
        String hex2 = "hex";
        String hex3 = "Hexadecimal";
        String hex4 = "hexadecimal";
        String dec1 = "decimal";
        String dec2 = "Decimal";
        String bin1 = "binary";
        String bin2 = "Binary";
        System.out.println("What are you converting to?");
        input2 = sc.nextLine();
        if (input2.equals(hex1)) {
            System.out.println("Invalid input.");
        } else if (input2.equals(hex2)) {
            System.out.println("Invalid input.");
        } else if (input2.equals(hex3)) {
            System.out.println("Invalid input.");
        } else if (input2.equals(hex4)) {
            System.out.println("Invalid input.");
        }
        else if (input2.equals(bin1)){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextobin(value);
        }
        else if (input2.equals(bin2)){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextobin(value);
        }
        else if (input2.equals(dec1)){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextodec(value);
        }
        else if (input2.equals(dec2)){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextodec(value);
        }
    }
    public static void hextodec(int value){

    }
    public static void hextobin(int value){

    }
    public static void dectohex(int value){

    }
    public static void dectobin(int value){

    }
    public static void bintodec(int value){

    }
    public static void bintohex(int value){

    }
}
