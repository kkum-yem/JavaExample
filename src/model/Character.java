package model;

public abstract class Character extends Person{
    //Magician 또한 싸움의 기능을 가지고 싶다는 전제에 캐릭터에 싸움의 기능을 강제화
    public abstract void attack(Hero hero);//{}없이 내용이 없기 떄문에 추상 클래스
}

