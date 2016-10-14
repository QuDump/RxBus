package com.qudump.dell.rxbus;

/**
 * Created by dell on 2016/10/14.
 */

public abstract class EventSubscriber<T> {
    public abstract void onEvent(T event);
    public void onError(Throwable throwable) {

    }
}
