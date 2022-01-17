package com.company;

import model.Hero;
import model.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person person2 = new Person("홍길동", 10);

        System.out.println(person);
        System.out.println(person2);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("베트맨");
        hero.attack(hero2); //슈퍼맨이 베트맨과 싸움을 했다
    }
}



