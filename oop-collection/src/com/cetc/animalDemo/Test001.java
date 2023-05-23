package com.cetc.animalDemo;

import java.util.ArrayList;

public class Test001 {
    public static void main(String[] args) {
        ArrayList<Cats> catList = new ArrayList<>();
        ArrayList<Dogs> dogList = new ArrayList<>();
        ArrayList<Animal> list = new ArrayList<>();

        Persian p = new Persian("小波",4);
        Lihua l = new Lihua("小花",3);
        Tidy t = new Tidy("小昊",2);
        Husky h = new Husky("小聪明",5);
        Cats ca = new Cats();
        Cats cb = new Cats("修猫咪",1);
        Dogs da = new Dogs();
        Dogs db = new Dogs("修狗崽",7);

        catList.add(p);
        catList.add(l);
        dogList.add(t);
        dogList.add(h);
        catList.add(ca);
        catList.add(cb);
        dogList.add(da);
        dogList.add(db);

        list.add(p);
        list.add(l);
        list.add(t);
        list.add(h);
        list.add(ca);
        list.add(cb);
        list.add(da);
        list.add(db);

//        System.out.println(catList);
//        System.out.println(dogList);

//        keepPet(catList);
//        keepPet(dogList);
        keepPet(catList,dogList);
    }

    /**
     * 只能养猫不能养狗
     */
    /*public static void keepPet(ArrayList<? extends Cats> catList){
        for (Cats c : catList) {
            c.eat();
        }
    }*/

    /**
     * 只能养狗不能养猫
     */
    /*public static void keepPet(ArrayList<? extends Dogs> dogList){
        for (Dogs d : dogList) {
            d.eat();
        }
    }*/

    /**
     *猫狗都能养
     */
    public static void keepPet(ArrayList<? extends Animal>...list){
        for (ArrayList<? extends Animal> list1 : list) {
            for (Animal v : list1) {
                v.eat();
            }
        }
    }

}
