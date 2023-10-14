package lesson7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork1 {
    // * 1) Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте
    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'у' || ch == 'е' || ch == 'ы' || ch == 'а' || ch == 'о' || ch == 'э' || ch == 'я' || ch == 'и' || ch == 'ю') {
                count++;
            }
        }
        return count;
    }

    //вариант2
    public static int countVowelsLetters(String str) {
        String vowel = "уеыаоэяию";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowel.contains(str.charAt(i) + "")) {
                count++;
            }
        }
        return count;
    }

    //вариант3
    public static int countVowelsLetters3(String str) {
        Pattern pattern = Pattern.compile("уеыаоэяию");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }


// * 2) Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке

    public static void reverseString(String text) {
        char[] array = text.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println(result);
    }
    //вариант2
    public static void reverseString2(String text) {
        System.out.println(new StringBuilder(text).reverse().toString());
    }

    //     * 3) Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации
    public static void punctuationMarks(String text) {
        char[] array = text.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            char ch = text.charAt(i);
            if (ch == '!' || ch == '.' || ch == ',' || ch == '?' || ch == ';' || ch == ':' || ch == '-' || ch == '(' || ch == ')') {
                count++;
            }
        }
        System.out.println("Количество знаков препинания: " + count);
    }

    //     * 4) В метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам
    public static void printSquare(int rows, int columns) {
//        int[][] square = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}






