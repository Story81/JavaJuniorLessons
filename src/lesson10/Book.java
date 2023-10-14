package lesson10;

import java.util.Objects;

public class Book extends PrintEdition {
    private String author;
    private int pages;

    public Book() {
    }

    public Book(String name, int year, String izdatelstvo, String author, int pages) {
        super(name, year, izdatelstvo);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + pages;
        return result;
    }

    @Override
    public String toString() {
        return "Книга {" +
                "автор ='" + author + '\'' +
                ", количество страниц =" + pages +
                super.toString();
    }
}
