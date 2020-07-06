package com.kuntsevich.task7.main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("1 - Belarusian\n2 - Russian\nAny - English");
            int choice = in.nextInt();
            String country = "";
            String language = "";
            switch (choice) {
                case 1:
                    country = "BY";
                    language = "be";
                    break;
                case 2:
                    country = "RU";
                    language = "ru";
            }
            Locale locale = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("datares.text", locale);
            String str1 = rb.getString("str1");
            System.out.println(str1);
            String str2 = rb.getString("str2");
            System.out.println(str2);
        }
    }
}
