package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;
import java.util.HashSet;

public class Operators_39_Collecting {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Beta")
                .collect(HashSet<String>::new, HashSet::add)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}