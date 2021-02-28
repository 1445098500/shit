package com.pp.proxy.jdk;

public class TargetImpl implements Target {
    @Override
    public void save() {
        System.out.println("save running");
    }
}
