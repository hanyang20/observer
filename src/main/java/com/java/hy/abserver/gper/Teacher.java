package com.java.hy.abserver.gper;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Gper gper = (Gper) o;
        Question question = (Question) arg;
        System.out.println("===============================");
        System.out.println("你好"+this.name+"老师,"+gper.getName()+"提交了一个"+question.getContent()+"的问题,等你解答。"+"提问者:"+question.getUserName());

    }
}
