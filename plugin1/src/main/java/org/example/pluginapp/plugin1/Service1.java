package org.example.pluginapp.plugin1;

import org.example.pluginapp.core.IService;

public class Service1 implements IService {
    @Override
    public void doJob() {
        System.out.println("Service 1");
    }
}
