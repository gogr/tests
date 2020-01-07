package com.example.utils;

import java.util.Date;

public class Helpers {
    /**
     * @param textWithSuffix - page titles, e.g. "Sergio Rossi's Shoes" or "February's Shoes"
     * @return text without suffix, e.g. "Sergio Rossi" or "February"
     */
    public static String removeShoesSuffix(String textWithSuffix) {
        return textWithSuffix.substring(0, textWithSuffix.indexOf("'s Shoes"));
    }
    /**
     * @param textWithSuffix - page titles, e.g. "Sergio Rossi's Shoes" or "February's Shoes"
     * @return text without suffix, e.g. "Sergio Rossi" or "February"
     */
    public static String removePrefix(String textWithSuffix) {
        String prefix = "Shoe Store: ";
        return textWithSuffix.substring(prefix.length());
    }

    /**
     * @return pseudo unique email address based on timestamp
     */
    public static String getUniqueEmail() {
        return String.format("test%s@mail.com", new Date().getTime());
    }
}
