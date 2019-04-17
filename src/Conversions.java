import java.util.*;
public class Conversions {
    public static void main(String[] args) {
        String input;
        Scanner read = new Scanner(System.in);
        System.out.println("Convert between Hex, Binary, and Decimal. Please enter unit that is being converted from.");
        input = read.nextLine();
        if (input == "Hex") {
            hexpre(input);
        } else if (input == "hex") {
            hexpre(input);
        } else if (input == "Hexadecimal") {
            hexpre(input);
        } else if (input == "hexadecimal"){
            hexpre(input);
    }


        }
    public static void hexpre(String input){
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.println("What are you converting to?");
        if (input == "Hex") {
            System.out.println("Invalid input.");
        } else if (input == "hex") {
            System.out.println("Invalid input.");
        } else if (input == "Hexadecimal") {
            System.out.println("Invalid input.");
        } else if (input == "hexadecimal") {
            System.out.println("Invalid input.");
        }
        else if (input == "Binary"){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextobin(value);
        }
        else if (input == "binary"){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextobin(value);
        }
        else if (input == "Decimal"){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextodec(value);
        }
        else if (input == "decimal"){
            System.out.println("What is the number to be converted?");
            value = sc.nextInt();
            hextodec(value);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    public static void hextodec(int value){
        System.out.println("poscheck");
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
