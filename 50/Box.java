public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double width, double height, double length) {
        length = length;
        height = height;
        width = width;
    }

    Box (double side) {
        this.width = side;
        this.length = side;
        this.height = side;
    }

    public Box(Box oldbox) {
        Box newBox = new Box(this.width, this.height, this.length);
    }

    public double volume() {
        return length * width * height;
    }

    private double faceArea() {
        return length * height;
    }

    private double sideArea() {
        return height * width;
    }

    private double topArea() {
        return length * width;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    public static Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
    }

    public static Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
    }

    public boolean nests(Box outsideBox) {
        return (outsideBox.width() > height && outsideBox.height() > height && outsideBox.length() > length);
    }

}