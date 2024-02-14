package com.itheima.a02oopextendsdemo3;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(int id, String name, String post) {
        super(id, name, post);
    }

    @Override
    public void work() {
        System.out.println("维护专员在工作");
    }
}
