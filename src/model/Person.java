package model;

public class Person{ //속성과 기능으로 나눠짐
    private String name;
    private int age;

    public Person(){ //클래스와 이름이 같은 기본생성자

    }

    public Person(String name, int age){ //필드를 전달받아 만드는 오버로드 된 생성자
        this.name = name; //초기화 this는 외부라는 변수에서 넘어온 값, 내가 가진 name이냐? 아니냐를 구분하기 위해
        this.age = age;
    }

    //private을 하는 대신 getter와 setter을 해줌
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    } //오른쪽 마우스를 통해 toString을 클릭하여 만들어줌
}
