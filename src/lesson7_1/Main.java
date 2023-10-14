package lesson7_1;

public class Main {
    public static void main(String[] args) {
//* 2) Создайте три экземпляра этого класса.
        Phone phone1 = new Phone("8-922-1111", "Samsung Galaxi S", 200); // создаем класс через конструктор

        Phone phone2 = new Phone();   // или таким образом
        phone2.setNumber("8-960-2222");
        phone2.setModel("IPhone12");

        Phone phone3 = new Phone("8-655-3333", "Nokia");

// * 3) Выведите на консоль значения их переменных.
        System.out.println("Телефон 1: " + phone1.getNumber() + ", " + phone1.getModel() + ", вес " + phone1.getWeight());
        System.out.println("Телефон 2: " + phone2.getNumber() + ", " + phone2.getModel());
        System.out.println("Телефон 3: " + phone3.getNumber() + ", " + phone3.getModel());

//Вызвать эти методы для каждого из объектов.
        phone1.receiveCall("Vasya " + phone1.getNumber());
        phone2.receiveCall("Olya " + phone2.getNumber());
        phone3.receiveCall("Ruslan " + phone3.getNumber());

// Манипуляции с классом Person
        System.out.println();

        Person person1 = new Person();
        person1.fullName = "Petrov Petr Petrovich";
        person1.age = 43;

        Person person2 = new Person("Ivanov Ivan Ivanovich",26);

        person1.talk();
        person2.talk();

        person1.move();
        person2.move();

    }
}
