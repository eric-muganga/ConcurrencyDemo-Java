package com.eric;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskQueue {
    private BlockingQueue<Task> queue = new LinkedBlockingQueue<Task>();

    public void addTask(Task task) {
        queue.add(task);
    }

    public Task getTask() throws InterruptedException {
        Thread.sleep(500);
        return queue.take();
    }
}
