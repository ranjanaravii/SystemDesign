package com.developer.Thread;

import java.util.concurrent.*;

public class CustomThreadPoolExample {

    public static void main(String[] args) {

        // Custom Rejection Handler
        RejectedExecutionHandler handler = new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                if (r instanceof MyTask) {
                    MyTask task = (MyTask) r;
                    System.out.println("Task Rejected: " + task.getTaskId());
                }
            }
        };

        // ThreadPoolExecutor Configuration
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                      // corePoolSize
                4,                      // maximumPoolSize
                10,                     // keepAliveTime
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),  // queue capacity
                handler                 // custom rejection handler
        );

        // Submit 10 tasks
        for (int i = 1; i <= 10; i++) {
            executor.execute(new MyTask(i));
        }

        executor.shutdown();
    }
}

// Custom Task
class MyTask implements Runnable {

    private final int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Executing Task " + taskId +
                    " by Thread " + Thread.currentThread().getName());

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}