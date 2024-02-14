package com.itheima.a02oopextendsdemo3;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(int id, String name, String post) {
        super(id, name, post);
    }

    @Override
    public void work() {
        super.work();
    }
}
