package lesson12_1;

import java.util.Comparator;
import java.util.TreeSet;

public class SortButton {
    public void sortByPriceFromTo(TreeSet<Kettle>kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {
                //this ---01
                // o---o2
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                //сортировка по рейтингу
                if (o1.getRating() != o2.getRating()) {
                    return Double.compare(o1.getRating(), o2.getRating());
                }
                //сортировка по скидке
                if (o1.getDiscount() != o2.getDiscount()) {
                    return o1.getDiscount() - o2.getDiscount();
                }
                //сортировка по наименованию
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        System.out.println("Сортировка по возрастанию цены:");
        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }
    public void sortByPriceToFrom(TreeSet<Kettle>kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {
                //this ---01
                // o---o2
                if (o2.getPrice() != o1.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }
                //сортировка по рейтингу
                if (o1.getRating() != o2.getRating()) {
                    return Double.compare(o1.getRating(), o2.getRating());
                }
                //сортировка по скидке
                if (o1.getDiscount() != o2.getDiscount()) {
                    return o1.getDiscount() - o2.getDiscount();
                }
                //сортировка по наименованию
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        System.out.println("Сортировка по убыванию цены:");
        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }
    public void sortByRating(TreeSet<Kettle>kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {
                if (o1.getRating() != o2.getRating()) {
                    return Double.compare(o2.getRating(), o1.getRating());
                }
                if (o2.getPrice() != o1.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getDiscount() != o2.getDiscount()) {
                    return o1.getDiscount() - o2.getDiscount();
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        System.out.println("Cортировка по популярности:");
        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }
    public void sortByDiscount(TreeSet<Kettle>kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {
                if (o1.getDiscount() != o2.getDiscount()) {
                    return o2.getDiscount() - o1.getDiscount();
                }
                if (o1.getRating() != o2.getRating()) {
                    return Double.compare(o2.getRating(), o1.getRating());
                }
                if (o2.getPrice() != o1.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        System.out.println("Cортировка по скидке:");
        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }
    public void sortByName(TreeSet<Kettle>kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.getDiscount() != o2.getDiscount()) {
                    return o2.getDiscount() - o1.getDiscount();
                }
                if (o1.getRating() != o2.getRating()) {
                    return Double.compare(o2.getRating(), o1.getRating());
                }
                if (o2.getPrice() != o1.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                return 0;
            }
        });
        System.out.println("Cортировка по названию:");
        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }
}
