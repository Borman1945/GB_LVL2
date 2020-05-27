package lesson5multithreading.synch;

import lesson5multithreading.thread.ThreadExample;

public class ExampleSyn {

    public static void main(String[] args) {
        ExampleSyn example = new ExampleSyn();

        new Thread(() -> example.met1()).start();
        new Thread(() -> example.met2()).start();


    }

    public void met1(){
        System.out.println("Start me1");
        for (int i = 0;i <11;i++)

            System.out.println(i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End me1");
    }


    public void met2(){
        System.out.println("Start me2");
        for (int i = 0;i <11;i++)

            System.out.println(i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End me2");
    }

}
