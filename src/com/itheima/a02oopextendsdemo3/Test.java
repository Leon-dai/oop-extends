package com.itheima.a02oopextendsdemo3;

import com.sun.tools.javac.Main;

public class Test {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer(001, "张三", "讲师");
        lec.work();

        Tutor t = new Tutor(002, "李四", "助教");
        t.work();

        Maintainer m = new Maintainer(003, "王五", "维护专员");
        m.work();

        Buyer b = new Buyer(004, "赵六", "采购专员");
        b.work();
    }
}
