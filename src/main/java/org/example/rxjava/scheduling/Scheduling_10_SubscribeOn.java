package org.example.rxjava.scheduling;

import io.reactivex.rxjava3.core.Observable;

import java.net.URL;
import java.util.Scanner;

public class Scheduling_10_SubscribeOn {
    public static void main(String[] args) {
        String href = "https://api.github.com/users/thomasnield/starred";
        Observable.fromCallable(() -> getResponse(href))
                //.subscribeOn(Schedulers.io())
                .subscribe(System.out::println);
        sleep(10000);
    }

    private static String getResponse(String path) {
        try {
            return new Scanner(new URL(path).openStream(),
                    "UTF-8").useDelimiter("\\A").next();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}