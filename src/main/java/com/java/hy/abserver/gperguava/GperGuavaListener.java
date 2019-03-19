package com.java.hy.abserver.gperguava;

import com.google.common.eventbus.Subscribe;
import com.java.hy.abserver.gper.Question;

/**
 * 监听器
 */
public class GperGuavaListener {

    private Question question;

    private GperGuava gperGuava;

    public GperGuavaListener(Question question, GperGuava gperGuava) {
        this.question = question;
        this.gperGuava = gperGuava;
    }

    public Question getQuestion() {
        return question;
    }

    public GperGuava getGperGuava() {
        return gperGuava;
    }

    /**
     * 只有通过@Subscribe注解的方法才会被注册进EventBus
     * 而且方法有且只能有1个参数

     * @param teacherGuava
     */
    @Subscribe
    public void listen(TeacherGuava teacherGuava){
        System.out.println("===============================");
        //System.out.println("你好"+teacherGuava.getName()+"老师,"+teacherGuava.getGperGuava().getName()+"提交了一个"+teacherGuava.getQuestion().getContent()+"的问题,等你解答。"+"提问者:"+teacherGuava.getQuestion().getUserName());
        System.out.println("你好"+teacherGuava.getName()+"老师,"+this.gperGuava.getName()+"提交了一个"+this.question.getContent()+"的问题,等你解答。"+"提问者:"+this.question.getUserName());


    }

}
