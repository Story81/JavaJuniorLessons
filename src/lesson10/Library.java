package lesson10;

import java.util.ArrayList;

public class Library {
    private ArrayList<PrintEdition> editions = new ArrayList<>();

    public void fillEditions() {
        Book book1 = new Book("Азбука", 1930, "АБВ", "Иванов", 30);
        Book book2 = new Book("Тарас Бульба", 1930, "АБВ", "Гоголь", 111);
        Book book3 = new Book("Олеся", 1930, "АБВ", "Толстой", 110);
        Jurnal jurnal1 = new Jurnal("Мурзилка", 2010, "ИздА", 5);
        Jurnal jurnal2 = new Jurnal("Юннат", 2005, "ИздБ", 11);
        editions.add(book1);
        editions.add(book2);
        editions.add(jurnal1);
        editions.add(jurnal2);
        editions.add(book3);

    }

    public void printAllEditions() {
        for (PrintEdition edition : editions) {
            System.out.println(edition); //!!! проявление полиморфизма
        }
    }
    public void printLargesBook (){
        PrintEdition largest = new Book("ы",1930,"А", "ФФФ",-1  ); //заглушка
        for (PrintEdition edition : editions) {
            if (edition instanceof Book) {
                if (((Book) edition).getPages() > ((Book) largest).getPages()) {
                    largest = edition;
                }
            }
        }
        System.out.println("Самая толстая книга - ");
        System.out.println(largest);
    }

}
