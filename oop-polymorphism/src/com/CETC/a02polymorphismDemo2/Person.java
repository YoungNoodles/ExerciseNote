package com.CETC.a02polymorphismDemo2;

public class Person {
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 喂宠物
     *
     * @param pet
     * @param something
     */
    public void keepPet(Pet pet, String something) {
        if (pet instanceof Cat cat) {
            cat.eat(something);
        } else if (pet instanceof Dog dog) {
            dog.eat(something);
        }
    }

    public void showPerson(){
        System.out.println("你是" + age + "的" + name + "\n");

    }
    public void showInformation(Pet pet) {
        System.out.println("年龄为" + age + "的" + name + "养了一只" + pet.getColor() + "的" + pet.getAge() + "的" + pet.catchType());
    }
}
