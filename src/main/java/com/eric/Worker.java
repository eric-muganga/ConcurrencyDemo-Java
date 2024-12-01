package com.eric;

public class Worker  implements Runnable {
    private TaskQueue taskQueue;


    public Worker(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            while(!Thread.currentThread().isInterrupted()) {
                Task task = taskQueue.getTask();
                System.out.println(Thread.currentThread().getName() +
                        " processing Task ID: " + task.getId());

                Thread.sleep(task.getDuration());
                System.out.println(Thread.currentThread().getName() +
                        " completed Task ID: " + task.getId());
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("Worker "+ Thread.currentThread().getName() +" - Finished.");
        }


    }
}
