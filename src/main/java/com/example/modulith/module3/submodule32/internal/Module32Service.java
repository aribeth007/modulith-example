package com.example.modulith.module3.submodule32.internal;

import com.example.modulith.module1.Module1Interface;
import com.example.modulith.module3.submodule31.Module31Interface;
import com.example.modulith.module3.submodule32.Module32Interface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Module32Service implements Module32Interface {
    private Module31Interface module31Interface;
    private Module1Interface module1Interface;
//    private Module31Service module1Service;

    @Override
    public void doModule32Things() {
        module31Interface.doModule31Things();
        System.out.println("Module 32 things");
        module1Interface.getUser();
    }
}
