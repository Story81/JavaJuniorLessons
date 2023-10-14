package lesson9_1;

public class Utils {
    public static int maxNumberOfPagesInBook (Media array[]) {
        int maxPages = 0;

        for (Media m : array) {
            if (m instanceof Books) {
                Books book = (Books) m;
                if (book.getNumbersOfPages() > maxPages) {
                    maxPages = book.getNumbersOfPages();
                }
            }
         }
        return maxPages;
    }

    public static void booksWithMaxNumberOfPages (Media array[]) {
        System.out.println("Издания с наибольшим количеством страниц:");
        for (Media m : array) {
            if (m instanceof Books) {
                Books book = (Books) m;
                if (book.getNumbersOfPages() == maxNumberOfPagesInBook(array)) {
                    System.out.println(m.toString());
                }
            }
        }
    }
}
