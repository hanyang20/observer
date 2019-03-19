package com.java.hy.abserver.gperguava;

import com.google.common.eventbus.EventBus;


import com.java.hy.abserver.gper.Question;


public class GperGuavaTest {

    public static void main(String[] args){

        /*//观察者
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("反射是什么?");
        GperGuava gperGuava = new GperGuava(question);
        gperGuava.publicshiQuestion(question);

        TeacherGuava teacherGuava = new TeacherGuava("tom",question,gperGuava);
        TeacherGuava teacherGuava1 = new TeacherGuava("mic",question,gperGuava);
        //TeacherGuava teacher = new TeacherGuava("tom",question,gperGuava);


        GperGuavaListener gperGuavaListener = new GperGuavaListener();
        EventBus eventBus = new EventBus("test");

        eventBus.register(gperGuavaListener);

        eventBus.post(teacherGuava);
       // eventBus.post(teacherGuava1);*/

        //观察者
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("反射是什么?");
        GperGuava gperGuava = new GperGuava(question);
        gperGuava.publicshiQuestion(question);

        TeacherGuava teacherGuava = new TeacherGuava("tom");
        TeacherGuava teacherGuava1 = new TeacherGuava("mic");
        //TeacherGuava teacher = new TeacherGuava("tom",question,gperGuava);


        GperGuavaListener gperGuavaListener = new GperGuavaListener(question,gperGuava);
        EventBus eventBus = new EventBus("test");

        eventBus.register(gperGuavaListener);

        eventBus.post(teacherGuava);

        eventBus.post(123);
        //eventBus.post(teacherGuava1);





    }
}
