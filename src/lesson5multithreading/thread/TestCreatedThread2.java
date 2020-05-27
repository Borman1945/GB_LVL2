package lesson5multithreading.thread;

public class TestCreatedThread2 {

    static class MyThred extends Thread{
        public void run(){
            for (int i = 0; i <10; i++){
                try{
                    Thread.sleep(100);
                    System.out.println("new thread: " + i);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new MyThred().start();
    }

}
