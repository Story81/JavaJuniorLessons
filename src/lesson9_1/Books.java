package lesson9_1;

import java.util.Objects;

public class Books extends Media {
    private String author;
    private int numbersOfPages;

    public Books(String title, String author, int yearOfPublication, int numbersOfPages, String publishingHouse) {
        super(title, yearOfPublication, publishingHouse);
        this.author = author;
        this.numbersOfPages = numbersOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumbersOfPages() {
        return numbersOfPages;
    }

    public void setNumbersOfPages(int numbersOfPages) {
        this.numbersOfPages = numbersOfPages;
    }


    @Override
    public String toString() {
        return "Книга {" +
//                super.toString()+
                "название: " + getTitle() +
                ", автор: " + author +
                ", год издания: " + getYearOfPublication() +
                ", количество страниц: " + numbersOfPages +
                ", издательство " + getPublishingHouse() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Books books = (Books) o;

        if (numbersOfPages != books.numbersOfPages) return false;
        return Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + numbersOfPages;
        return result;
    }
}
