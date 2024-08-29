package com.example.modulith.module1.internal;

import com.example.modulith.module1.Module1Interface;
import org.springframework.stereotype.Service;

@Service
public class Module1Service implements Module1Interface {
    @Override
    public String getUser() {
        return "User";
    }
}
