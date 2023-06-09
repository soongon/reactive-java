package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_03_Conditional {
    public static void main(String[] args) {
        Observable<String> items = Observable.just("Alpha", "Beta");
        items.filter(s -> s.startsWith("Z"))
                .defaultIfEmpty("None")
                .subscribe(System.out::println);
    }
}