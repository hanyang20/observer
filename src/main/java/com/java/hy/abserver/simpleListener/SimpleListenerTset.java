package com.java.hy.abserver.simpleListener;

import com.google.common.eventbus.EventBus;

public class SimpleListenerTset {

    public static void main(String[] args){

        EventBus eventBus = new EventBus();
        SimpleListener simpleListener = new SimpleListener();
        eventBus.register(simpleListener);
        eventBus.post("哈哈哈發順豐");

        }
}
