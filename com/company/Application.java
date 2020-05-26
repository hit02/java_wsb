package com.company;

public class Application implements Comparable<Application> {
    private final String name;
    private final double price;
    private final String version;

    public Application(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public int compareTo(Application other) {
        String str1 = this.getName();
        String str2 = other.getName();
        int length1 = str1.length();
        int length2 = str2.length();
        int lengthMin = Math.min(length1, length2);

        for (int i = 0; i < lengthMin; i++) {
            int str1_ch = str1.charAt(i);
            int str2_ch = str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (length1 != length2) {
            return length1 - length2;
        }
        else {
            return 0;
        }
    }

}
