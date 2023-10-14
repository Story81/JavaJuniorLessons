package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //this ---01
                // o---o2
                if (!o1.getMetall().equals(o2.getMetall())) {
                    return o1.getMetall().compareTo(o2.getMetall());
                }
                if (o1.getNominal() !=o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();
                }
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getDiametr() != o2.getDiametr()) {
                    return Double.compare(o1.getDiametr(), o2.getDiametr());
                }

                return 0;
            }
        });
        coins.add(new Coin(2.5, "Золото", 5, 1990));
        coins.add(new Coin(2.5, "Золото", 5, 1990));
        coins.add(new Coin(3, "Серебро", 10, 1970));
        coins.add(new Coin(5.5, "Золото", 10, 1999));
        coins.add(new Coin(3.5, "Серебро", 5, 1790));

        for (Coin c: coins) {
            System.out.println(c);
        }
    }
}
