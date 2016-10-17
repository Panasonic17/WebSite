package TEst;

/**
 * Created by Саша on 10.10.2016.
 */
public class GoParaThread {
    static  int GoPara=0;
    static  int GoHOme=0;
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            public void run() {
                while(true)
                    GoPara++;
            }
        });
        Thread t2=new Thread(new Runnable() {
            public void run() {
                while(true)
                    GoHOme++;
            }
        });
        t1.setDaemon(true);
        t2.setDaemon(true);
    //    t1.setPriority(1);
       // t2.setPriority(9);
        t2.start();
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(GoHOme- GoPara);
        System.exit(0);
    }
}
