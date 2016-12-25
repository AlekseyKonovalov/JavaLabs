

public class Ex8Lucky {

    private static class settings {
        static int x = 0;
        static int count = 0;
    }
    static settings s= new settings();

    static class LuckyThread extends Thread {
        @Override
        public void run() {
            synchronized(s){
            while (s.x < 999999) {
                s.x++;
                if ((s.x % 10) + (s.x / 10) % 10 + (s.x / 100) % 10 == (s.x / 1000)
                        % 10 + (s.x / 10000) % 10 + (s.x / 100000) % 10) {
                    System.out.println(s.x);
                    s.count++;

                }
            }
        }}
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new LuckyThread();
        Thread t2 = new LuckyThread();
        Thread t3 = new LuckyThread();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Total: " + s.count);
    }
}