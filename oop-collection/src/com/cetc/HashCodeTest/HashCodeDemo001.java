package com.cetc.HashCodeTest;

public class HashCodeDemo001 {
    public static void main(String[] args) {
        Student stu1 = new Student("LiSi",23);
        Student stu2 = new Student("ZhangSan",22);
        Student stu3 = new Student("ZhangSan",22);

        System.out.println(stu1.hashCode());//未重写：668386784  重写：73399653
        System.out.println(stu2.hashCode());//未重写：1329552164 重写：541947363
        System.out.println(stu3.hashCode());//未重写：363771819  重写：541947363

        //哈希碰撞
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354
    }
}
