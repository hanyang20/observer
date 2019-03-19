package com.java.hy.abserver.gperguava;

import com.google.common.eventbus.Subscribe;
import com.java.hy.abserver.gper.Gper;
import com.java.hy.abserver.gper.Question;

/**
 * 观察者
 */
public class TeacherGuava{

    private String name;

    public TeacherGuava(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
