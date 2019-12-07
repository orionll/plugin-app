package org.example.pluginapp.plugin2;

import org.example.pluginapp.core.IService;

public class Service2 implements IService {
    @Override
    public void doJob() {
        System.out.println("Service 2");
    }
}
