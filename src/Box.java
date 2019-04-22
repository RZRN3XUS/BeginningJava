public class Box {
    private int width;
    private int length;
    private int height;

    public void setDimension() {
        width = 1;
        length = 1;
    }
    public void setDims() {
        width = 1;
        length = 1;
    }

    public void SetWidth(int width1) {
        width = width1;
    }

    public void SetLength(int length1) {
        length = length1;
    }

    public void SetHeight(int height1) {
        height = height1;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return "Width = " + width + "and Length = " + length;
    }

    public void Area(int length1, int width1) {
        System.out.println("Area = " + length1 * width1);
    }

    public void Volume(int length1, int width1, int height1) {
        System.out.println("Volume = " + length1 * width1 * height1);
    }
}
