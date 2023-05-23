package com.CETC.CodeBlockTest;

public class Go {
    //静态代码块
    static {
        System.out.println("--我是不是最先运行？静态代码块");
        System.out.println("--我只能写在方法外");
        int b = 10;
    }
    public static void main(String[] args) {
        CodeTest01 code1 = new CodeTest01();
        CodeTest01 code2 = new CodeTest01("狗子","100","未知");
    }

    static {
        System.out.println("--我是不是第二个运行啊？第二个静态代码块");
        System.out.println("--代码块结束里面所有变量都没了");
    }
}
