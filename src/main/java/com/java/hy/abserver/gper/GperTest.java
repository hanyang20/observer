package com.java.hy.abserver.gper;

public class GperTest {

    public static void main(String[] args){

        //被观察者
        Gper gper = Gper.getGper();
        //观察者
        Teacher teacher = new Teacher("tom");
        Teacher teacher1 = new Teacher("安师傅");


        Question question = new Question();
        question.setUserName("小明");
        question.setContent("反射是什么?");
        //把触发时间通知给观察者
        gper.addObserver(teacher);
        gper.addObserver(teacher1);

        gper.publiucshiQuestion(question);


    }
}
