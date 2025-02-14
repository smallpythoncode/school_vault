```
public class BadThreads2 {

    String message;

    public BadThreads2() {
    }

    private class CorrectorThread extends Thread {
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
        BadThreads2 bt = new BadThreads2();
        BadThreads2.CorrectorThread ct = bt.new CorrectorThread();
        ct.start();
        bt.message = "Mares do not eat oats.";
        Thread.sleep(2000);
        // key statement 2
        System.out.println(bt.message);
    }
}
```