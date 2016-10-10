
import java.util.Scanner;

public class lab34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  countBeforeTheComa = in.nextInt();
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;




        float c = 0.7f;
     //   System.out.println(a.compareTo(b);

        compare(a, b, countBeforeTheComa );
    }

    static void compare(float a , float b, int countBeforeTheComa){

        a=Math.round(countBeforeTheComa);
        System.out.println(a);


    }

}
