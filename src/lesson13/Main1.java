package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridj fridj = new Fridj();
        fridj.addProduct("Бананы", 3);
        fridj.addProduct("Яблоки", 2);
        fridj.addProduct("Помидоры", 4);
        fridj.addProduct("Картофель", 5);
        fridj.addProduct("Бананы", 2);
        fridj.addProduct("Сыр", 1);
        fridj.addProduct("Слива", 10);
        fridj.getProduct("Бананы", 4);
        fridj.printAllProducts();
        fridj.printProductsLess2Kg(); //  * 1. Метод должен выводить на консоль те продукты, которые скоро закончатся (меньше 2 кг)
        fridj.printProductMaxWeight();//  * 2. Вывести на консоль продукт, которого больше всего в холодильнике
        fridj.sortAndPrintProducts1();//  * 3.1вар. Вывести на консоль продукты, отсортированные по названию
        fridj.sortAndPrintProducts2();//  * 3.2вар.  Вывести на консоль продукты, отсортированные по названию
        fridj.sortByWeight();         //  * 4*. Вывести на консоль продукты, отсортированные по весу от меньшего к большему
      }
}
