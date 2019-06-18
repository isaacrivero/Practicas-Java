package com.ejemplos.reactiva;

import java.util.concurrent.Flow;

public class MySubscriber < T > implements Flow.Subscriber < T > {
    private Flow.Subscription subscription;
    @Override
    public void onSubscribe (Flow.Subscription subscription) {
        this .subscription = subscription;
        subscription.request ( 1 ); // Long.MAX_VALUE used here will be considered to obtain unlimited data.
    }
    @Override
    public void onNext (T item) {
        System.out.println("Subscriber :  " + Thread.currentThread().getName()  + " item " + item);
        System.out.println ( "Got:" + item);
        subscription.request ( 1 ); // Long.MAX_VALUE is also available here
    }
    @Override
    public void onError (Throwable t) {
        t.printStackTrace ();
    }
    @Override
    public void onComplete () {
        System.out.println ( "Done" );
    }
}