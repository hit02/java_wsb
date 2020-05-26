package com.company.devices;

import com.company.Application;
import com.company.ByPriceComparator;
import com.company.animals.Human;
import com.company.animals.Url;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Phone extends Device {

    public final String defaultAppServer = "example.com";
    public final String defaultVersion = "BEST";
    public final String defaultProtocol = "ftp";
    private final Human owner;
    public HashSet<Application> setOfApplications;

    public Phone(String producer, String model, Integer yearOfProduction, Human owner) {
        super(producer, model, yearOfProduction);
         setOfApplications = new HashSet<>();
         this.owner = owner;
    }

    public void installNewApp(Application app) throws Exception {
        if(this.owner.getCash() <= app.getPrice()) {
            throw new Exception("not enough money");
        }
        this.owner.setCash(this.owner.getCash() - app.getPrice());
        this.setOfApplications.add(app);
    }

    public boolean checkIfAppIsInstalled(Application app) {
        return setOfApplications.contains(app);
    }

    public boolean checkIfAppIsInstalled(String checkedApp) {
        for(Application app : setOfApplications) {
           if(app.getName().equals(checkedApp)) {
               return true;
           }
        }
        return false;
    }

    public void printAllFreeApps() {
        for(Application app : setOfApplications) {
            if(app.getPrice() == 0) {
                System.out.println(app.getName());
            }
        }
    }

    public double priceOfAllApps() {
        double sum = 0;
        for(Application app : setOfApplications) {
            sum += app.getPrice();
        }
        return sum;
    }

    public void printAllAppsAlphabeticallyNames() {
        List<Application> sortedAlphabeticallyList = new ArrayList<>(setOfApplications);
        Collections.sort(sortedAlphabeticallyList);
        for(Application app : sortedAlphabeticallyList) {
            System.out.println(app.getName());
        }
    }

    public void printAllAppsInPriceOrder() {
        List<Application> sortedAlphabeticallyList = new ArrayList<>(setOfApplications);
        sortedAlphabeticallyList.sort(new ByPriceComparator());
        for(Application app : sortedAlphabeticallyList) {
            System.out.println(app.getName());
        }
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

    public Human getOwner() {
        return owner;
    }
}
