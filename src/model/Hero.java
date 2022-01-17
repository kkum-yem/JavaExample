package model;

public class Hero extends Character{ //person의 속성을 가지고 + 속성을 더 가짐
    public Hero(String name){ //Hero의 생성
        setName(name);
    }

    private boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public void attack(Hero hero){
        System.out.println(this.getName() + "은" + hero.getName()+ "꼭 싸움을 했다.");
    }
}
