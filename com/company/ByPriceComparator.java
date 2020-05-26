package com.company;

import java.util.Comparator;

public class ByPriceComparator implements Comparator<Application> {
    public int compare(Application app1, Application app2) {
        if(app1.getPrice() - app2.getPrice() < 0) {
            return -1;
        } else if(app1.getPrice() - app2.getPrice() == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
