package org.example.rxjava.scheduling;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class Scheduling_20_UnsubscribeOn {
    public static void main(String[] args) {
        Disposable d = Observable.interval(1, TimeUnit.SECONDS)
                .doOnDispose(() -> System.out.println("Disposing on thread "
                                        + Thread.currentThread().getName()))
                .subscribe(i -> System.out.println("Received " + i));
        sleep(3000);
        d.dispose();
        sleep(3000);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}