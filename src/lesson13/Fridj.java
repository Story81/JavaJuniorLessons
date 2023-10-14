package lesson13;

import java.util.*;

public class Fridj{
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacity = 500;

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            products.put(product, weight + products.get(product));
        } else {
            products.put(product, weight);
        }
    }

    //проход по коллекции
    public void printAllProducts() {
        System.out.println("\nВсе продукты из холодильника:");
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void getProduct(String product, int weight) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта (" + product + ")  в холодильнике нет");
            return;
        }
        if (products.get(product) < weight) {
            System.out.println("Недостаточно " + product + " в холодильнике");
            products.remove(product);
            return;
        }
        if (products.get(product) == weight) {
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - weight);
    }

    /**
     * 1. Метод должен выводить на консоль те продукты, которые скоро закончатся (меньше 2 кг)
     * 2. Вывести на консоль продукт, которого больше всего в холодильнике
     * 3. Вывести на консоль продукты, отсортированные по названию (смотреть в интернете)
     * 4*. Вывести на консоль продукты, отсортированные по весу от меньшего к большему
     */

    public void printProductsLess2Kg() {
        System.out.println("\nПродукты, которых менее 2 кг:");
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() < 2) {
                System.out.println(product.getKey() + " - " + product.getValue());
            }
        }
    }

    public void printProductMaxWeight() {
        System.out.println("\nПродукт, которого больше всего:");
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (maxEntry == null || product.getValue() > maxEntry.getValue()) {
                maxEntry = product;
            }
        }
        System.out.println(maxEntry);
    }

    //Сортировка
    //1. Используя TreeMap (сортировка по естественному упорядочению ключей)

    public void sortAndPrintProducts1() {
        Map<String, Integer> map = new TreeMap<String, Integer>(products);
        System.out.println("\n1 вариант. Отсортированные продукты из холодильника: " + map);
    }

    //2. Используя List
    public void sortAndPrintProducts2() {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(products.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println("\n2 вариант. Отсортированные продукты из холодильника:");
        for (Map.Entry<String, Integer> product : list) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void sortByWeight() {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(products.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("\nОтсортированные продукты по весу:");
        for (Map.Entry<String, Integer> product : list) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    }








