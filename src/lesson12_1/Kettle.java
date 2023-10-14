package lesson12_1;

import java.util.Objects;

public class Kettle implements Comparable<Kettle> {
    private String name;
    private int price;
    private double rating;
    private int discount;

    public Kettle() {
    }

    public Kettle(String name, int price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kettle kettle = (Kettle) o;

        if (price != kettle.price) return false;
        if (Double.compare(kettle.rating, rating) != 0) return false;
        if (discount != kettle.discount) return false;
        return Objects.equals(name, kettle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + discount;
        return result;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", discount=" + discount +
                '}';
    }

    @Override

    //this - первый чайник
    //o - второй чайник
    //сортировка по цене (сначала дорогие)
    public int compareTo(Kettle o) {
        if (this.price != o.price) {
            return this.price - o.price;
        }
        //сортировка по рейтингу
        if (this.rating != o.rating) {
            return Double.compare(this.rating, o.rating);
        }
        //сортировка по скидке
        if (this.discount != o.discount) {
            return this.discount - o.discount;
        }
        //сортировка по наименованию
        if (this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        return 0;
    }
}
