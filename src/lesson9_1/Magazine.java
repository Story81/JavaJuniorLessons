package lesson9_1;

import java.util.Date;

public class Magazine extends Media {
    private int numberInYear;

    public Magazine(String title, int yearOfPublication, int numberInYear, String publishingHouse) {
        super(title, yearOfPublication, publishingHouse);
        this.numberInYear = numberInYear;
    }

    public int getNumberInYear() {
        return numberInYear;
    }

    public void setNumberInYear(int numberInYear) {
        this.numberInYear = numberInYear;
    }

    @Override
    public String toString() {
        return "Журнал {" +
                "название: " + getTitle() +
                ", год выпуска: " + getYearOfPublication() +
                ", издательство: " + getPublishingHouse() +
                ", номер в году " + numberInYear +
                 '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        return numberInYear == magazine.numberInYear;
    }

    @Override
    public int hashCode() {
        return numberInYear;
    }
}
