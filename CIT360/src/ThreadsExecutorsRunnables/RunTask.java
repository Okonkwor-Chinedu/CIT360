package ThreadsExecutorsRunnables;

import java.util.concurrent.atomic.AtomicInteger;





public class RunTask implements Runnable {



    private AtomicInteger counter = new AtomicInteger(0);



    @Override

    public void run(){



        for(int i = 0; i < 50; i++){

            System.out.println("Running " + Thread.currentThread().getName());


            counter.incrementAndGet();

            System.out.println("The value in the counter for " + Thread.currentThread().getName() + " is now: " + counter);

     


            try{

                Thread.sleep((long)(Math.random()*1000));

            }catch (InterruptedException e){

                e.printStackTrace();

            }

        }
    }
}