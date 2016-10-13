
public class lab35 {
    public static void main(String[] args) {
        float f1 = 0.0f/1.0f;
        float f2 = 0.0f/-1.0f;
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("f1==f2: "+(f1==f2));
        compareFloat(f1, f2);
    }

    private static void compareFloat(float a , float b){
        System.out.println("f1==f2: "+( Float.floatToIntBits(a) == Float.floatToIntBits(b)));
    }
}
