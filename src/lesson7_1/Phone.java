package lesson7_1;

/**
 * 1) Создайте класс Phone, который содержит переменные number, model и weight.
 * 2) Создайте три экземпляра этого класса.
 * 3) Выведите на консоль значения их переменных.
 * 4) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 * Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * 5) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 * 6) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * 7) Добавить конструктор без параметров.
 */


public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
