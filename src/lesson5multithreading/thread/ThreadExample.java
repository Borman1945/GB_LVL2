package lesson5multithreading.thread;

public class ThreadExample {
    static int count;
    public static void main(String[] args) {
      /*  Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                prnt;
            }
        });*/
        System.out.println(Thread.currentThread().getName());
        count = 10000;
        Thread thread1 = new Thread(() -> prnt(),"Namber1");
        Thread thread2 = new Thread(() -> prnt(),"Namber2");
        thread1.start();

        thread2.start();
try {
    thread1.join();
    thread2.join();
} catch (InterruptedException e){

}
        System.out.println(count);

    }

    private static void prnt(){
      for (int i =0;i <5000;i++)
            synchronized (ThreadExample.class){
          count = count -1;
            }
        try{
            Thread.currentThread().sleep(100);
        }catch (InterruptedException e){

        }


    }

}
