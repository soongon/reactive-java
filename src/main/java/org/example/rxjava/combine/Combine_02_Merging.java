package org.example.rxjava.combine;

import io.reactivex.rxjava3.core.Observable;

public class Combine_02_Merging {
    public static void main(String[] args) {
        Observable<String> src1 = Observable.just("Alpha", "Beta");
        Observable<String> src2 = Observable.just("Gamma", "Delta");
        Observable<String> src3 = Observable.just("Epsilon", "Zeta");
        Observable<String> src4 = Observable.just("Eta", "Theta");
        Observable<String> src5 = Observable.just("Iota", "Kappa");
        Observable.mergeArray(src1, src2, src3, src4, src5)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}