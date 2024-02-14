package com.itheima.a02oopextendsdemo3;

public class Teacher extends Employee{

    public Teacher() {
    }

    public Teacher(int id, String name, String post) {
        super(id, name, post);
    }

    @Override
    public void work() {
        super.work();
    }
}
