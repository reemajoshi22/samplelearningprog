package com.learning;

import java.util.Locale;
import java.util.ResourceBundle;

public class WhichLanguage {
 public static void main(String[] args) {
 Locale locale = new Locale("fr");
 ResourceBundle rb = ResourceBundle.getBundle("WhichLanguage", Locale.ENGLISH);
 System.out.println(rb.getString("hello"));
 }
}