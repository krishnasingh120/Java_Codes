package app;

public class App {
    public static void main(String[] args){
        System.out.println("Hello Krishna");
        myfun();
        funny();
        Yolo();
        System.out.println(add(10,12));
    }

    public static void myfun(){
        System.out.println("My Fun");
    }
    public static void funny(){
        System.out.println("Hello fun");
    }
    public static void Yolo(){
        System.out.println("Yooooo");
    }
    public static int add(int a,int b){
        return a + b;
    }
}

