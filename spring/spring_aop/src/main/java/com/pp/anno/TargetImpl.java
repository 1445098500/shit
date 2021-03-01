package com.pp.anno;


import org.springframework.stereotype.Component;

@Component("target")
public class TargetImpl implements Target {

    @Override
    public void save() {
        System.out.println("save running");

    }
}
