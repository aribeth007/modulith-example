package com.example.modulith.module2.internal;

import com.example.modulith.commons.model.DemoDto;
import com.example.modulith.commons.utils.DateUtil;
import com.example.modulith.module1.Module1Interface;
import com.example.modulith.module1.internal.Module1Config;
import com.example.modulith.module2.Module2Interface;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;

@Service
@AllArgsConstructor
public class Module2Service implements Module2Interface {
    private Module1Interface module1Interface;
    private HttpClient client1;

    private HttpClient client2;

    @Override
    public void createDemo(DemoDto demoDto)  {
        module1Interface.getUser();
        System.out.println("Created demo " + demoDto + " at date " + DateUtil.getCurrentDate());
    }

    @Scheduled(fixedRate = 10000)
    public void schedulePrintHttpClient() {
        System.out.println("Http client " + client1 + ", " + client1.version().toString());
        System.out.println("Http client " + client2 + ", " + client2.version().toString());
        System.out.println();
    }
}
