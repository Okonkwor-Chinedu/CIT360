package ThreadsExecutorsRunnables;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;


class Test extends Thread  
{ 
    public void run() 
    { 
        System.out.println("Run method executed by child Thread"); 
    } 
}

public class Main{

    public static void main (String[]args){

        System.out.println();

        System.out.println("Counter will stop when it reaches 10 for each thread");

        System.out.println();

        System.out.println();



        runnables();
        extendThread();

        executeThreadPool();

    }

    public static void runnables(){

        System.out.println();

        Thread t1 = new Thread(new RunTask());

        Thread t2 = new Thread(new RunTask());

        Thread t3 = new Thread(new RunTask());

        Thread t4 = new Thread(new RunTask());

        System.out.println();

        t1.start();

        t2.start();

        t3.start();

        t4.start();


    }


    public static void executeThreadPool(){

        System.out.println();

        ExecutorService execService = Executors.newFixedThreadPool(4);



        System.out.println();

        execService.execute(new RunTask());

        execService.execute(new RunTask());

        execService.execute(new RunTask());

        execService.execute(new RunTask());



        execService.shutdown();



        System.out.println();
       

    }

    public static void extendThread(){
    
    	Test t = new Test(); 
        t.start(); 
}
}