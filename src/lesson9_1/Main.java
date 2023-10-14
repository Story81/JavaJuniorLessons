package lesson9_1;

public class Main {
    public static void main(String[] args) {
        Media[] printedMedias = {
                new Books("Колобок", "Руская народная", 2016, 13, "Издательство А"),
                new Books("Капитанская дочка", "А.С. Пушкин", 2015, 213, "Издательство Б"),
                new Magazine("Журнал1", 2022, 5, "Издательство В "),
                new Magazine("Журнал2", 2023, 9, "Издательство Г "),
                new Books("Капитал. том 1", "Карл Маркс", 1993, 1013, "Издательство А"),
                new Books("Капитал. Том 2", "Карл Маркс", 1994, 1013, "Издательство А"),
        };

        for (Media m : printedMedias) {
            System.out.println(m);
        }

        Utils.maxNumberOfPagesInBook(printedMedias);
        Utils.booksWithMaxNumberOfPages(printedMedias);

    }
}
