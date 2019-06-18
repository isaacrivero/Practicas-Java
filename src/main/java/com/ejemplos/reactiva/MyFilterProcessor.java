package com.ejemplos.reactiva;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Predicate;

public   class   MyFilterProcessor < T, R >   extends   SubmissionPublisher <R>   implements Flow.Processor< T , R > {

    private Predicate<T> predicate;
    private Flow.Subscription subscription;

    public MyFilterProcessor(Predicate<T> predicate) {
        super();
        this.predicate = predicate;
    }

    @Override
    public   void   onSubscribe ( Flow.Subscription subscription )   {
        this . subscription   =   subscription ;
        subscription . request ( 1 ) ;
    }

    public void onNext(T item) {
        System.out.println("Filter Processor:  " + Thread.currentThread().getName()  + " item " + item);
        if (predicate.test(item)) {
            submit((R) item);
        }
        subscription.request(1);
    }

    @Override
    public   void   onError ( Throwable   t )   {
        t . printStackTrace ( ) ;
    }

    @Override
    public   void   onComplete ( )   {
        close ( ) ;
    }
}
