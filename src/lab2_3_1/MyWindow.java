package lab2_3_1;

/**
 * Created by m18 on 17.02.2016.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    public void printFields(){
        System.out.println(this.toString());
    }

    //Constructors
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {
        this(111.1,111.1,5,"white",true);
    }

    public MyWindow(double width) {
        this();
        this.width = width;
    }

    public MyWindow(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
    }

    //Getters:
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
