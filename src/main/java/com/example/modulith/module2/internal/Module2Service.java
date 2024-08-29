package com.example.modulith.module2.internal;

import com.example.modulith.commons.model.DemoDto;
import com.example.modulith.commons.utils.DateUtil;
import com.example.modulith.module1.Module1Interface;
import com.example.modulith.module2.Module2Interface;
import org.springframework.stereotype.Service;

@Service
public class Module2Service implements Module2Interface {
    private Module1Interface module1Interface;
    @Override
    public void createDemo(DemoDto demoDto)  {
        module1Interface.getUser();
        System.out.println("Created demo " + demoDto + " at date " + DateUtil.getCurrentDate());
    }
}
