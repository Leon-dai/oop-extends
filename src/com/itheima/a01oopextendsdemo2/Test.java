package com.itheima.a01oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.breakHome();
        h.eat();
        h.drink();
        h.lookHome();
        System.out.println("----------------------");

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();
        System.out.println("----------------------");

        ChineseRuralDog crd = new ChineseRuralDog();
        crd.eat();
        crd.drink();
        crd.lookHome();
    }
}
