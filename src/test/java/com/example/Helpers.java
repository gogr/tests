package com.example;

import java.util.Date;

public class Helpers {
    public static String getUniqueEmail() {
        return String.format("test+%s@example.com", new Date().getTime());
    }

    public static String getUniqueUserName() {
        return String.format("test%s", new Date().getTime());
    }
}
