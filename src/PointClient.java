public class PointClient {
    public static void main(String[] args){
        Points p1 = new Points();
        Points p2 = new Points();
        Points p3 = new Points();
        p1.Setx(3);
        p1.Sety(7);
        p2.Setx(-2);
        p2.Sety(-8);
        p1.setLocation(-2,5);
        double distance = Points.distance(p1, p2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(distance);

    }
}
