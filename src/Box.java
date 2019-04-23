public class Box {
    private double width;
    private double length;

    public Box() {
        width = 1;
        length = 1;
    }
    public Box(double width1, double length1) {
        width = width1;
        length = length1;
    }

    public void SetWidth(int width1) {
        width = width1;
    }

    public void SetLength(int length1) {
        length = length1;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return "Width = " + width + "and Length = " + length;
    }

    public void Area() {
        System.out.println("Area = " + length * width);
    }

    public void Volume(double height) {
        System.out.println("Volume = " + length * width * height);
    }
}
