package lesson7;

public class Person {
    // объявление характеристик (поля класса или переменные класса)
    private int age;
    private String name;
    private String surname;
    private String adress;

    public int getAge() {
        return age;
    }

    //static не будет, мы обращаемся или к vasya или olya
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname; // this = я, у меня. This -это объект, у которого вызван текущий метож
    }
}