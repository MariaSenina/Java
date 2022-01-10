package com.senina.maria.java.threadsAndConcurrency;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "\nHello " + name;
    }
}

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        //A promise that we will get a result at a later time
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Java"));
        System.out.print("new CallableTask(\"Java\") executed");

        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);

        executorService.shutdown();
        System.out.print("\nMain method completed");
    }
}
