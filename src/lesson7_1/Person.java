package lesson7_1;

/**
 * Создать класс Person, который содержит:
 * 1) переменные fullName, age;
 * 2) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * 3) Добавьте два конструктора  - Person() и Person(fullName, age).
 * 4) Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 * 5) Вызовите методы move() и talk().
 */

public class Person {
    String fullName;
    int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }

    public void talk () {
        System.out.println(fullName + " говорит");
    }

    public Person (String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person () {
    }



}
