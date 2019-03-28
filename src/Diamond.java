
/*
Christopher Dycus
3/25/2019
Program - print a diamond using methods
Version 1.0
 */
public class Diamond {

    public static void main(String[] args) {

        for (int i = 0; i <= 2; i++) { //repeats 3 times
            diamondMethod();  //Calling print method
        }
        x();
        System.out.println("");
        diamondTop();
        square();
        System.out.println("|United|");
        System.out.println("|States|");
        square();
        System.exit(0);
    }

    public static void diamondMethod() { //defining method
        diamondTop();
        diamondBot();
    }

    public static void diamondTop() { //defining method
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void diamondBot() { //defining method
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
    public static void x() { //defining method
        diamondBot();
        diamondTop();
    }
    public static void square() { //defining method
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }

}

