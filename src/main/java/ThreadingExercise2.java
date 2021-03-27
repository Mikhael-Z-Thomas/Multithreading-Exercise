public class ThreadingExercise2 implements Runnable {

    public void run()
    {
        try {
            System.out.println("Implement Runnable Interface in Java 7");
        }catch (Exception e){
            System.out.println("Error");
        }

    }

    public static void main(String args[])
    {
        //Java 7
        ThreadingExercise2 te1 = new ThreadingExercise2();
        Thread t1 = new Thread(te1);

        t1.start();


        //Java 8
        Runnable r;
        r = ()->{
            try {
                System.out.println("Implement Runnable Interface in Java 8");
            }catch (Exception e){
                System.out.println("Error");
            }
        };

        Thread thread1 = new Thread(r);
        thread1.start();
    }


}
