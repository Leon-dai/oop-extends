package com.itheima.a02oopextendsdemo3;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int id, String name, String post) {
        super(id, name, post);
    }

    @Override
    public void work() {
        System.out.println("助教在工作");
    }
}
