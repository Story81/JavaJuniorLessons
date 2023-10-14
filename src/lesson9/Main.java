package lesson9;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Сковорода", 2000, 1500);
        Tovar tovar2 = new Tovar("Сковорода", 2000, 1500);
        System.out.println(tovar1.equals(tovar2)); // товар1 лежит в той же ячейке памяти, что и товар2? нет

        System.out.println(tovar1.toString()); // .toString() серым. его после переопределения в классе tovar можно не писать
        System.out.println(tovar1);

    }
}
