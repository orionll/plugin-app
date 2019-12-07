package org.example.pluginapp.core;

public class BasicService implements IService {
    @Override
    public void doJob() {
        System.out.println("Basic service");
    }
}
