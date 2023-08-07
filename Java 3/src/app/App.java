package app;

public class App {
    public static void main(String[] args){
        System.out.println("Hello World");
        fun();
        Infun();
         System.out.println( isleap(2020));
         System.out.println(greatest(9,4,7));
         System.out.println(Volofcyl(12, 33));
    }
    public static void fun(){
        System.out.println("In my fun");
    }
    public static void Infun(){
        System.out.println("Jai ho");
    }
    public static boolean isleap(int year){
        if((year % 100 == 0 && year % 400 == 0)||(year % 100 != 0 && year % 4 == 0))
            return true;
        else
            return false;
    }
    public static int greatest(int a, int b, int c){
        if(a>b && a>c)
            return a;
        else
            return c;
    }
    public static double Volofcyl(int r, int h){
        return (3.14 * r * r * h);
    }
}
