package com.helloworld;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    @Async
    public CompletableFuture<String> processData(String input){
        return CompletableFuture.supplyAsync(()->{
            if (input.equalsIgnoreCase("error")){
                throw new RuntimeException("Invalid input received");
            }
            return "Processed: " + input;
        }).handle((result, ex)->{
            if (ex != null){
                System.out.println("An error occured with: " + ex.getMessage());
                return "Fallback result";
            }

            return result;
        });
    }
}
