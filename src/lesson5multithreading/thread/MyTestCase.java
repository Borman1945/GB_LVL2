package lesson5multithreading.thread;

public class MyTestCase {
    public static void main(String[] args) throws InterruptedException {
        Thread tthred1 = new Thread(() -> thredActoin(), "Поток 1");
        tthred1.start();
        tthred1.sleep(25);


                tthred1.interrupt();

        System.out.println(Thread.currentThread().getName());


    }


    private static void thredActoin(){
        for (int i =0; i < 100; i ++){



                if (Thread.currentThread().isInterrupted()){
                    System.out.println(" Interapted thread");
                    System.out.println(" итерация = " + i);
                    return;
                }
                System.out.println(Thread.currentThread().getName() + " итерация = " + i);

        }

    }


}
