package lab2_3_1;

/**
 * Created by m18 on 17.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyWindow window1 = new MyWindow(155.2, 201.15, 3, "red", false);
        MyWindow window2 = new MyWindow(93.1, 28.15, 13, "blue", false);
        MyWindow window3 = new MyWindow(155.2, 123.1335, 3, "yellow", true);
        MyWindow window4 = new MyWindow(155.2, 112.125, 3, "brown", false);
        MyWindow window5 = new MyWindow(155.2, 122.1, 3, "black", true);
        MyWindow windowByDefault = new MyWindow();
        MyWindow[] windows = {new MyWindow(),
                new MyWindow(11.12),
                new MyWindow(111.15, 75, 99),
                new MyWindow(218.15, 199.22, 9),
                new MyWindow(178.22, 170, 3, "pink"),
                new MyWindow(158.22, 270.11, 7, "pink", true)};
        for(MyWindow window: windows){
            System.out.println(window);
        }
    }
}
