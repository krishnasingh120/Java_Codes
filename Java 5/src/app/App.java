package app;

public class App{
    public static void main(String[] args){
        DTF(65);
        FTD(44);

    }
    public static double DTF(double c){
        double f = c* (9.0f/5.0f) + 32;
        System.out.println(f+"Degree Fahrenheit");
        return c;
    }
    public static double FTD(double d){
        double e = (d - 32) * 5/9;
        System.out.println(e+"Degree Celsius");
        return e;
    }

        }


