package com.example.modulith.module2.internal;

import com.example.modulith.module1.Module1Event;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class Module1EventManager {

    @Async
    @TransactionalEventListener
    void on(Module1Event event) {
        System.out.println("Module 1 event: " + event.getMessage());
    }
}
