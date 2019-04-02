public class ChapterTest1 {
    public static void main(String[] args) {
    lanterns();
    }
    public static void lanterns(){
        roof("*", " ");
        System.out.println();
        System.out.println();
        roof("*", " ");
        mid("| ", "*");
        roof("*", " ");
    }
    public static void roof(String fill, String space) {
        for (int count = 0; count < 4; count++){
            System.out.print(space);
        }
        for (int count = 0; count < 4; count++){
            System.out.print(fill);
        }
        System.out.println(fill);
        for (int count = 0; count < 2; count++){
            System.out.print(space);
        }
        for (int count = 0; count < 8; count++) {
            System.out.print(fill);
        }
        System.out.println(fill);
        for (int count = 0; count <12; count++) {
            System.out.print(fill);
        }
        System.out.println(fill);
    }
    public static void mid(String fill, String wall){
        System.out.print(wall+" ");
        for (int count = 0; count <4; count++) {
            System.out.print(fill);
        }
        System.out.println(wall);
        for (int count = 0; count <12; count++) {
            System.out.print(wall);
        }
        System.out.println("*");
    }
}
