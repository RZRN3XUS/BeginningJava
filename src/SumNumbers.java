import java.util.*;
public class SumNumbers {

    public static void main(String[] args) {
        int low;
        int high;
        int thing;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Low value");
        low = sc.nextInt();
        System.out.println("Enter High value");
        high = sc.nextInt();
        int sum = low;
        int finalsum;
        thing = low;
        for (int i = low; i <= high; i++) {
            sum = sum+thing;
            thing++;
        }
        finalsum = sum-low;
        System.out.println("sum = " + finalsum);
    }
}
