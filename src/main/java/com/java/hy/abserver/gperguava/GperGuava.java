package com.java.hy.abserver.gperguava;


import com.java.hy.abserver.gper.Question;

/**
 * 被观察者
 */
public class GperGuava{

    private String name = "Gper生态圈";

    private Question question;


    private static GperGuava gperGuava = null;
    public GperGuava() {
    }

    public GperGuava(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public Question getQuestion() {
        return question;
    }

    public static GperGuava getGperGuava(){

        if (gperGuava == null){
            gperGuava = new GperGuava();
        }
        return gperGuava;
    }


    public void publicshiQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.name +"上提交了一个问题");

    }
}
