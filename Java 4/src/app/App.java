package app;

public class App {
    public static void main(String[] args) {
        marks( 30);
    }
    public static void marks(int m) {
        if (m >= 75)
            System.out.println("Distinction");
        else if (m >= 60 && m < 75)
            System.out.println("First Class");
        else if (m >= 50 && m < 60)
            System.out.println("Second Class");
        else if (m >= 40 && m < 50)
            System.out.println("Third Class");
        else
            System.out.println("Fail");


    }
}