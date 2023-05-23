package com.CETC.a01polymorphismDemo1;

public class Test {
    public static void main(String[] args) {
        Father f = new Son("张三");
        f.test();
        f.eat();
        f.drink();

        //高转低要强转
        /*Son son = (Son) f;
        son.test();
        //低转高不需要强转
        Father father = son;
        father.test();*/

        if(f instanceof Son son){
            son.eat();
        }
    }
}
