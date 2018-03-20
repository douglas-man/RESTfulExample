package com.webservices.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("webapi")
public class ExampleApplication extends Application {
    private Set<Object> singletons = new HashSet<>();
    private Set<Class<?>> empty = new HashSet<>();

    public ExampleApplication() {
        singletons.add(new MyResource());
    }

    @Override
    public Set<Class<?>> getClasses() {
        return empty;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}