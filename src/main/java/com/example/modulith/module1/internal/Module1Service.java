package com.example.modulith.module1.internal;

import com.example.modulith.module1.Module1Interface;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;

@Service
@AllArgsConstructor
public class Module1Service implements Module1Interface {
    private HttpClient client1;

    private HttpClient client2;

    @Override
    public String getUser() {
        return "User";
    }

    @Scheduled(fixedRate = 10000)
    public void schedulePrintHttpClient() {
        System.out.println("Http client " + client1 + ", " + client1.version().toString());
        System.out.println("Http client " + client2 + ", " + client2.version().toString());
        System.out.println();
    }
}
