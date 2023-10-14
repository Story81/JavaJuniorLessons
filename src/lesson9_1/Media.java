package lesson9_1;

import java.util.Objects;

public abstract class Media {
    //переменные
    private String title;
    private int yearOfPublication;
    private String publishingHouse;

//конструкторы
    public Media() {
    }

    public Media(String title, int yearOfPublication, String publishingHouse) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.publishingHouse = publishingHouse;
    }
//геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
// остальное
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Media media = (Media) o;

        if (yearOfPublication != media.yearOfPublication) return false;
        if (!Objects.equals(title, media.title)) return false;
        return Objects.equals(publishingHouse, media.publishingHouse);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + yearOfPublication;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        return result;
    }
}
