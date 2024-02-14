package com.itheima.a02oopextendsdemo3;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(int id, String name, String post) {
        super(id, name, post);
    }

    @Override
    public void work() {
        System.out.println("采购专员在工作");
    }
}
