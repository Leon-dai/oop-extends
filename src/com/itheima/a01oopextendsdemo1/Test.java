package com.itheima.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        /**
         * Java只能单继承，不能多继承，但是可以多层继承
         * Java中所有的类都直接或者间接继承于Object类
         * 子类只能访问父类中非私有的成员
         * 因为爸爸的私房钱儿子是用不了的
         */
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("---------------");
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.destoryHome();
        h.lookHome();
    }
}
