package com.CETC.a02polymorphismDemo2;

import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你的角色：");
        int mode = sc.nextInt();

        if (mode == 1) {
            //你是老王
            Person Wang = new Person("老王", "30岁");
            Wang.showPerson();

            Pet pet = new Dog("2岁", "黑颜色");
            Wang.showInformation(pet);

            System.out.println("\n请投喂你的宠物：");
            String food = sc.next();
            Wang.keepPet(pet, food);
        } else if (mode == 2) {
            Person Li = new Person("老李", "25岁");
            Li.showPerson();

            Pet pet = new Cat("3岁", "灰颜色");
            Li.showInformation(pet);

            System.out.println("\n请投喂你的宠物：");
            String food = sc.next();
            Li.keepPet(pet, food);

        }

    }
}
