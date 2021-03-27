public class Deadlock {
    public static void main(String[] args) {
        final String r1 = "testing 1";
        final String r2 = "testing 2";
        // t1 tries to lock resource1 then resource2

        Thread t1 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 1: locked r1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (r2) {
                        System.out.println("Thread 1: locked r2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (r2) {
                    System.out.println("Thread 2: locked r2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (r1) {
                        System.out.println("Thread 2: locked r1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}