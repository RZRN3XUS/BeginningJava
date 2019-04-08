public class Points {
    private int x;
    private int y;

    public void Setx(int x1){
        x=x1;
    }
    public void Sety(int y1){
        y=y1;
    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
    public void setLocation(int x1, int y1){
        x=x1;
        y=y1;
    }
    public String toString(){
       return "Point = ( "+x+","+y+")";
    }
    public static double distance(Points p1, Points p2){
        double varx = Math.pow(p1.x-p2.x, 2);
        double vary = Math.pow(p1.y-p2.y, 2);
        return Math.sqrt(varx+vary);
    }
    public void translate(int x, int y){

    }
}
