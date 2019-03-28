
/*
Christopher Dycus
3/25/2019
Challenge
Version 2.0
 */

public class Challenge1 {
    public static final int SIZE = 8;
    public static void main(String[] args) {
        diamond("/", "*", "\\", " ", "|");
    }
    public static void diamond(String front, String middle, String end, String fill, String wall) {
        bar();
        top(front, middle, end, fill, wall);
        bottom(end, middle, front, fill, wall);
        bar();
        bottom(end, middle, front, fill, wall);
        top(front, middle, end, fill, wall);
        bar();
    }
    public static void bar() {
        System.out.print("+");
        for (int count = 0; count <= SIZE + 2; count++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void top(String front, String middle, String end, String fill, String wall) {

        System.out.print(wall+fill);
        for (int count = 0; count < (SIZE / 2); count++) {
            System.out.print(fill);
        }
        System.out.print(middle);
        for (int count2 = 0; count2 < (SIZE / 2); count2++) {
            System.out.print(fill);
        }
        System.out.println(fill+wall);
        for (int iteration = 0; iteration < (SIZE / 2) - 1; iteration++) {
            System.out.print(wall+fill);
            for (int count = SIZE/2-1; count > iteration; count--) {
                System.out.print(fill);
            }
            for (int slash = -1; slash < iteration; slash++) {
                System.out.print(front);
            }
            System.out.print(middle);
            for (int slash = -1; slash < iteration; slash++) {
                System.out.print(end);
            }
            for (int count = SIZE/2-1; count > iteration; count--) {
                System.out.print(fill);

            }
            System.out.println(fill+wall);
        }
    }
    public static void bottom(String front, String middle, String end, String fill, String wall) {
        for (int iteration = 0; iteration < (SIZE / 2) - 1; iteration++) {
            System.out.print(wall+" ");
            for (int slash = -1; slash < iteration; slash++) {
                System.out.print(fill);
            }
            for (int count = SIZE/2-1; count > iteration; count--) {
                System.out.print(front);
            }
            System.out.print(middle);
            for (int count = SIZE/2-1; count > iteration; count--) {
                System.out.print(end);
            }
            for (int slash = -1; slash < iteration; slash++) {
                System.out.print(fill);

            }
            System.out.println(fill+wall);
        }
        System.out.print(wall+fill);
        for (int count = 0; count < (SIZE / 2); count++) {
            System.out.print(fill);
        }
        System.out.print(middle);
        for (int count = 0; count < (SIZE / 2); count++) {
            System.out.print(fill);
        }
        System.out.println(fill+wall);
    }
}