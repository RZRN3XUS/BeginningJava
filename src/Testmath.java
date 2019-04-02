public class Testmath {
    public static void main(String[] args){
        double num1 = 2104.581470;
        double num2 = 120947.238569;
        double num3 = 129467.46;
        double multi = num1*num2*num3;
        System.out.println(num1+num2+num3 + " = Sum");
        System.out.println(multi + " = Product");
        double maximum = Math.min(num1, num2);
        double maximumfinal = Math.max(maximum, num3);
        double minimum = Math.min(num1, num2);
        double minimumfinal = Math.min(maximum, num3);
        System.out.println(maximumfinal + " = Maximum");
        System.out.println(minimumfinal + " = Minimum");
        double squarert = Math.sqrt(multi);
        System.out.println(squarert + " = square root of product");
        System.out.println("Random number is " + Math.random());
    }
}
