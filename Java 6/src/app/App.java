package app;

public class App {
    public static void main(String[] args){
        num();
        evennum();
        table();

    }
    public static int num()
    {
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i % 2);
            i++;
        }
        return i;
    }
    public static int evennum()
    {
        int j = 1;
        while (j <= 20)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        j++;
        }
        return j;
    }
    public static int table(){
        int m = 5,n = 10,k = 1;
        while(k<=n)
        {
            System.out.println(m + "X" + k + "=" + m*k);
            k++;
        }
        return m*k;
    }
}
