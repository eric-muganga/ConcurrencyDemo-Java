package com.eric;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TaskQueue taskQueue = new TaskQueue();

        //Adding a tasks
        for (int i = 0; i < 10; i++) {
            taskQueue.addTask(new Task(i, 1000 * i));
        }

        // Creating workers
        Thread worker1 = new Thread(new Worker(taskQueue), "Worker-1");
        Thread worker2 = new Thread(new Worker(taskQueue), "Worker-2");

        worker1.start();
        worker2.start();
    }
}
