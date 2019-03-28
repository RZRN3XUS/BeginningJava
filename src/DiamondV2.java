
/*
Christopher Dycus
3/25/2019
Program - print a diamond using methods
Version 2.0
 */
public class DiamondV2 {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        diamond("*" , "**", "*");
    }
    public static void diamond(String beg, String inside, String end) {
        diamondTop(beg, inside, end);
        diamondBot(end, inside, beg);
    }
    public static void diamondTop(String beg, String inside, String end) {
        for (int counter = 1; counter <= SIZE; counter++) {
            for (int space = 1; space <= -counter + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print(beg);
            for (int space = 1; space < counter; space++) {
                System.out.print(inside);
            }
            System.out.println(end);

        }
    }
    public static void diamondBot(String beg, String inside, String end) {
        for (int counter = SIZE; counter > 0; counter--) {
            for (int space = 1; space <= -counter + SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print(beg);
            for (int space = 1; space < counter; space++) {
                System.out.print(inside);
            }
            System.out.println(end);

        }
    }
}

