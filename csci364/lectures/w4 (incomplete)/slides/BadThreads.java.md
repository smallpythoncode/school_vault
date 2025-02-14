```
public class BadThreads {

    static String message;

    public BadThreads() {
    }

    private static class CorrectorThread extends Thread {
        private CorrectorThread() {
        }

        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException ie) {
                // empty
            }
            // key statement 1
            message = "Mares do eat oats.";
        }
    }

    public static void main(String args[]) throws InterruptedException {
        (new CorrectorThread()).start();
        message = "Mares do not eat oats.";
        Thread.sleep(2000);
        // key statement 2
        System.out.println(message);
    }
}
```