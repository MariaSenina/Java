package com.senina.maria.java.threadsAndConcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("Java"),
                new CallableTask("Mashi"), new CallableTask("Rexxy"));

        //wait for all tasks to complete execution and then puts them into the List
        List<Future<String>> results = executorService.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
