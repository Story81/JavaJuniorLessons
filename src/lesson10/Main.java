package lesson10;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.fillEditions();
        library.printAllEditions();
        library.printLargesBook();
    }
}
