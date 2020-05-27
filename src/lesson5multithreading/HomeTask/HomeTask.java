package lesson5multithreading.HomeTask;

import java.util.HashSet;

public class HomeTask {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    private void firstMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();

        newVarible(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }


        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[arr.length - 1]);

    }


    private void secondMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);



        Thread thread1 = new Thread(() -> newVarible(a1));
        Thread thread2 = new Thread(() -> newVarible(a2));

        System.out.println(Thread.currentThread().getName());
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.println(Thread.currentThread().getName());
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[arr.length - 1]);
    }

    static void newVarible(float[] arr) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }


    public static void main(String[] args) {
        HomeTask timeVarray = new HomeTask();
        timeVarray.firstMethod();
        timeVarray.secondMethod();

    }

}
