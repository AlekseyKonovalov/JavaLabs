import java.util.Scanner;

public class lab34 {
    public static void main(String[] args) {


        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        System.out.println("Введите параметр , обозначающий число знаков после запятой: ");
        Scanner sc = new Scanner(System.in);
        int countBefore=sc.nextInt();

        System.out.println(compare(sum,c,countBefore));
    }

    static boolean compare(float a , float b, int precision){

        if (Float.isNaN(a) && Float.isNaN(b))
            return true;

        if(Float.floatToIntBits(a) == Float.floatToIntBits(b))
            return true;

        if (Math.abs(a - b) < Math.pow(10, precision * (-1)))
            return true;
        else
            return false;
    }

}
