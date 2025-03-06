```
/*
 * MutexDemo.java
 */
package mutex;

/**
 * Demonstrates a mutex controlling access to a critical section.
 *
 * @author david
 */
public class MutexDemo implements Runnable {
	private String name = null;
	private Object lock = null;

    /**
     * A runnable object.
     *
     * @param name for this object
     * @param lock controlling access to a critical section
     * @see run()
     */
	public MutexDemo(String name, Object lock) {
		this.name = name;
		this.lock = lock;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println(name + " before critical section");
		synchronized (lock) {
			System.out.println("\t" + name + " inside critical section");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("\t" + name + " still inside critical section");
		}
		System.out.println(name + " after critical section");
	}

	/**
     * Program entry point.
     *
	 * @param args no command-line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("MutexDemo main start");
		Object aLock = new Object();
        Object bLock = new Object();

		MutexDemo aRunner = new MutexDemo("aRunner", aLock);
        MutexDemo bRunner = new MutexDemo("bRunner", bLock);

		Thread aThread = new Thread(aRunner);
		Thread bThread = new Thread(bRunner);

		try {
			aThread.start();
			Thread.sleep(500);
			bThread.start();

			aThread.join();
			bThread.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("MutexDemo main end");
	}
}
```