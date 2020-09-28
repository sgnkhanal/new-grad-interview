
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

public class PrintFibonacciSeries {

    public static void main (String[] args) {

        int a = 0;
        int b = 1;
        int c;
        int limit = 10;

        //start by printing the first two.
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i<limit; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
