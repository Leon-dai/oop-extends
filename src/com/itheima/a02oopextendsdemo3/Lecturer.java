package com.itheima.a02oopextendsdemo3;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int id, String name, String post) {
        super(id, name, post);
    }

    @Override
    public void work() {
        System.out.println("讲师在讲课");
    }
}
