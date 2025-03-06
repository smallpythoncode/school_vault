```
/*
 * Deadlock.java
 */
package mutex;

/**
 * Demonstrates deadlock between two threads.
 */
public class Deadlock {

    /**
     * A polite friend.
     */
	static class Friend {
		private final String name;

		public Friend(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

        /**
         * A Friend bows to the current object. As part of the bow, this object
         * bows back to the bower.
         *
         * @param bower One that bows to this object.
         */
		public synchronized void bow(Friend bower) {
			System.out.format("%s: %s has bowed to me!%n", name, bower.getName());
			bower.bowBack(this);
		}

        /**
         * A Friend bows back to this object.
         *
         * @param bower One that bows back to this object.
         */
		public synchronized void bowBack(Friend bower) {
			System.out.format("%s: %s has bowed back to me!%n",
					this.name, bower.getName());
		}
	}

    /**
     * Program entry point.
     *
     * @param args no command line arguments
     */
	public static void main(String[] args) {
		final Friend alphonse = new Friend("Alphonse");
		final Friend gaston = new Friend("Gastone");

		Runnable r1 = new Runnable() {
			public void run() {
				alphonse.bow(gaston);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
        try { t1.join(); } catch (InterruptedException ie) {}

		Runnable r2 = new Runnable() {
			public void run() {
				gaston.bow(alphonse);
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
```