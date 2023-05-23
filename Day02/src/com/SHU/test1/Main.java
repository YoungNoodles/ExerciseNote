package com.SHU.test1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int numberA=sc.nextInt();
        System.out.println("请输入第二个数字：");
        int numberB=sc.nextInt();
        int sum=numberA+numberB;
        System.out.println("和为："+sum);
    }
}
