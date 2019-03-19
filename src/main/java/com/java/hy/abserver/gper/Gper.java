package com.java.hy.abserver.gper;

import java.util.Observable;

/**
 * 相当于被观察者
 */
public class Gper extends Observable {

    private String name = "Gper生态圈";

    private static Gper gper = null;
    public Gper() {
    }


    public static Gper getGper(){

        if (gper == null){
            gper = new Gper();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publiucshiQuestion(Question question){

        System.out.println(question.getUserName()+"在"+this.name +"上提交了一个问题");
        setChanged();
        notifyObservers(question);

    }
}
