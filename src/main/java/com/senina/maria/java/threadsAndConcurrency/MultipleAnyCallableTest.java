package com.senina.maria.java.threadsAndConcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("Java"),
                new CallableTask("Mashi"), new CallableTask("Rexxy"));

        //wait for one thread (any thread) to finish and return the result
        String result = executorService.invokeAny(tasks);

        System.out.println(result);

        executorService.shutdown();
    }
}
