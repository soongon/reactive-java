package org.example.rxjava.combine;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.GroupedObservable;

public class Combine_17_GroupBy {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<GroupedObservable<Integer, String>> byLengths =
                source.groupBy(s -> s.length());
    }
}