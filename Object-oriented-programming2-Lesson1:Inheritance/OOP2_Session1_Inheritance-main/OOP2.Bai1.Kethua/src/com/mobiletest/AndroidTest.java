package com.mobiletest;

public class AndroidTest {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        Iphone iphone = new Iphone();

        nokia.downloadApp();
        iphone.downloadApp();
    }
}
