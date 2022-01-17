package com.company;

import model.*;
import model.Character;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person person2 = new Person("홍길동", 10);

        System.out.println(person);
        System.out.println(person2);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("베트맨");
        hero.attack(hero2); //슈퍼맨이 베트맨과 싸움을 했다

        Character character = new Hero("슈퍼맨2"); //new Character은 안되나 Hero로는 가능
        Magician magician = new Magician();
        Character magician2 = new Magician();
        ICharacter magician3 = new Magician();

        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add(magician);
        characterArrayList.add(magician2);
        characterArrayList.add(hero); //여러가지 타입을 담을 수 있다는 다형성
    }
}



