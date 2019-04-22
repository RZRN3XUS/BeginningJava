public class BoxClient {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box();
        box1.SetWidth(2);
        box1.SetHeight(3);
        box1.SetLength(4);
        box1.toString();
        box2.SetLength(8);
        box2.SetWidth(4);
        box2.SetHeight(2);
        box2.toString();
        box1.Area(4,2);
        box2.Area(8,4);
        box1.Volume(4,2,3);
        box2.Volume(8,4,2);
    }
}
