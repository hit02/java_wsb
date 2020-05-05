package com.company.devices;

import com.company.animals.Url;

public class Phone extends Device {

    public final String defaultAppServer = "example.com";
    public final String defaultVersion = "BEST";
    public final String defaultProtocol = "ftp";

    Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("blep blop");
    }

    public void installAnApp(String name){
        installAnApp(name, defaultVersion, defaultAppServer);
    }

    public void installAnApp(String name, String version){
        installAnApp(name, version, defaultAppServer);
    }

    public void installAnApp(String name, String version, String appServer){
        System.out.println("Installing: " + name + " v" + version  + " from " + defaultProtocol + "://" + appServer);
    }

    public void installAnApp(Url address){
        System.out.println("Installing: " + address);
    }
}
