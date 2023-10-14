package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Person vasya = new Person();
      //  vasya.age =23;
        vasya.setAge(17);
        vasya.setName("Василий");
     //   vasya.name = "Vasiliy";

        Person olya = new Person();
        olya.setAge(26);
        olya.setName("Ольга");

       // при вызове метода передается 2 формата параметров - явные (в кр.скобках)  и неявные(это объект, у кот вызван метод Он доступен по слову this)
        vasya.setName("qwerty");





        System.out.println();
    }
}
