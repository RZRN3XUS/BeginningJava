public class BoxClient {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box();
        box1.SetWidth(2);
        box1.SetLength(4);
        box1.toString();
        box2.SetLength(8);
        box2.SetWidth(4);
        box2.toString();
        box1.Area();
        box2.Area();
        box1.Volume(9);
        box2.Volume(8);
    }
}
