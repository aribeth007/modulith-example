package com.example.modulith.module3.submodule31.internal;

import com.example.modulith.module3.submodule31.Module31Interface;
import org.springframework.stereotype.Service;

@Service
public class Module31Service implements Module31Interface {

    @Override
    public void doModule31Things() {
        System.out.println("Module 31 things");
    }
}
