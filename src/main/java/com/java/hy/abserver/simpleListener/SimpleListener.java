package com.java.hy.abserver.simpleListener;

import com.google.common.eventbus.Subscribe;

public class SimpleListener {
    /**
     *
     * 只有通过@Subscribe注解的方法才会被注册进EventBus
     * 而且方法有且只能有1个参数

     * @param message
     */
    @Subscribe
    public void listener(String message){
        System.out.println(message);
    }

    /**
     * post() 不支持自动装箱功能,只能使用Integer,不能使用int,否则handlersByType的Class会是int而不是Intege
     * 而传入的int msg参数在post(int msg)的时候会被包装成Integer,导致无法匹配到
     * @param message
     */
    @Subscribe
    public void listener(Integer message){
        System.out.println(message);
    }
}
