package singleton1;

/**
 * ass we can!
 * created by shing
 * 2019-09-09 22:24
 */
public class Singleton04 {
    private static Singleton04  instance;
    private Singleton04(){

    }
    public static Singleton04 getInstance() {
        synchronized (Singleton04.class) {
            if (instance == null) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                instance = new Singleton04();
            }

            return instance;
        }
    }

}
