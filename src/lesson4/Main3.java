package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Выберете уровень: ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");

        //формула создания любого ссылочного типа:
        //Название ссылочного типа_название переменной_new_Название ссылочного типа (что положить system это наш компьютер, система. Ввод, т.е. мы считываем с консоли)
        Scanner scanner = new Scanner(System.in);
        //метод next берет всю строку до нажатия enter
        String level = scanner.next();
        if (level.equalsIgnoreCase("новичок")) {  //если мы ввели новичок (без учета регистра)
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {
                //нужно поставить рандомно 1 мину
                //надо сгенерировать случайное число индекс строки и колонки
                int row = ThreadLocalRandom.current().nextInt(0, 9); //8 это индекс строки,   row - ряд
                int col = ThreadLocalRandom.current().nextInt(0, 9); //8 это индекс строки,   col - колонка
                if (field[row][col] != 0) { // если уже есть в клеточке мина
                    i--;
                } else { // если нет в клеточке мины
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        } else if (level.equalsIgnoreCase("любитель")) {
            int[][] field = new int[16][16];
            for (int i = 0; i < 40; i++) {
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 16);
                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        } else if (level.equalsIgnoreCase("профессионал")) {
            int[][] field = new int[16][30];
            for (int i = 0; i < 99; i++) {
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 30);
                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        } else if (level.equalsIgnoreCase("особый")) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите ширину поля: ");
            int widthSpecial = scan.nextInt();
            System.out.print("Введите длину поля: ");
            int lenthSpecial = scan.nextInt();
            System.out.print("Введите количество бомб: ");
            float numbersOfBomb = scan.nextFloat();

            int[][] field = new int[lenthSpecial][widthSpecial];
            for (int i = 0; i < numbersOfBomb; i++) {
                int row = ThreadLocalRandom.current().nextInt(0, lenthSpecial);
                int col = ThreadLocalRandom.current().nextInt(0, widthSpecial);
                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Выберите уровень из предложенных выше");
        }
    }
}




