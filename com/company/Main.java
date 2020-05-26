package com.company;

import com.company.animals.Human;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human human = new Human(1);
        human.setCash(10000);
        Phone phone = new Phone("producer", "model", 2020, human);
        Application a1 = new Application("a", "1", 0.0);
        Application a2 = new Application("ab", "1", 0.0);
        Application a3 = new Application("c", "1", 2.0);
        Application a4 = new Application("f", "1", 5.0);
        Application a5 = new Application("b", "1", 3.0);
        phone.installNewApp(a1);
        phone.installNewApp(a2);
        phone.installNewApp(a3);
        phone.installNewApp(a4);
        phone.installNewApp(a5);
        System.out.println(phone.priceOfAllApps());
        System.out.println("alpha");
        phone.printAllAppsAlphabeticallyNames();
        System.out.println("price");
        phone.printAllAppsInPriceOrder();
        System.out.println("free");
        phone.printAllFreeApps();
    }
}
