package lesson12_1;

import java.util.Collection;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Kettle> kettles = new TreeSet<>();
        kettles.add(new Kettle("Polaris PWK", 2000, 3.8, 30));
        kettles.add(new Kettle("Tefal Glass", 1900, 4.2, 0));
        kettles.add(new Kettle("Kitfort KT-640", 1900, 4.2, 30));
        kettles.add(new Kettle("Redmond RK-G212S", 3900, 4.2, 10));
        kettles.add(new Kettle("Redmond RD-G150D", 3900, 4.2, 10));

        SortButton sortButton = new SortButton();
        sortButton.sortByPriceFromTo(kettles);
        sortButton.sortByPriceToFrom(kettles);
        sortButton.sortByRating(kettles);
        sortButton.sortByDiscount(kettles);
        sortButton.sortByName(kettles);
    }
}
