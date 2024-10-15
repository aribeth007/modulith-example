package com.example.modulith.module1.internal;

import com.example.modulith.module1.Module1Event;
import com.example.modulith.module1.Module1Interface;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.http.HttpClient;

@Service
@AllArgsConstructor
public class Module1Service implements Module1Interface {
    private HttpClient client1;

    private HttpClient client2;

    private ApplicationEventPublisher events;

    @Override
    public String getUser() {
        return "User";
    }

    @Transactional
    @Scheduled(fixedRate = 10000)
    public void schedulePrintHttpClient() {
        System.out.println("Http client " + client1 + ", " + client1.version().toString());
        System.out.println("Http client " + client2 + ", " + client2.version().toString());
        System.out.println();

        events.publishEvent(new Module1Event("module1_event"));
    }
}
