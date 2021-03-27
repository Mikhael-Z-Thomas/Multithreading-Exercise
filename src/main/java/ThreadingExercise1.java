public class ThreadingExercise1 extends Thread {

    public void run()
    {
        try {
            System.out.println("Extends Thread Class");
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void main(String args[])
    {
        ThreadingExercise1 object = new ThreadingExercise1();

        object.start();


    }


}
