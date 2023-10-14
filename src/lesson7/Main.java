package lesson7;

public class Main {
    public static void main(String[] args) {

        int countVowels = HomeWork1.countVowels("проверка текста");
        System.out.println("Количество гласных букв в тексте: " + countVowels); // вывод на консоль реализован для самопроверки

        int countVowels2 = HomeWork1.countVowelsLetters("проверка текста");
        System.out.println("Количество гласных букв в тексте: " + countVowels2); // вывод на консоль реализован для самопроверки

        int countVowels3 = HomeWork1.countVowelsLetters("проверка текста");
        System.out.println("Количество гласных букв в тексте: " + countVowels2); // вывод на консоль реализован для самопроверки

        HomeWork1.reverseString("text123");
        HomeWork1.reverseString2("text123");
        HomeWork1.punctuationMarks("знаки() препи-на-ни-я!?");
        HomeWork1.printSquare(5,5);
    }
}
