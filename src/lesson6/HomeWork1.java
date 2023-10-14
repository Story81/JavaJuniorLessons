package lesson6;
//Создаем класс в котором прописываем методы:
//1) метод принимает входящими параметрами двухмерный массив с числами. И возвращает из метода кол-во четных чисел в двухмерном массиве

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int values[][] = new int[6][6];
        System.out.println("Задание 1. \nДан массив:");
        for (int i = 0; i < values.length; i++) {
            // do the for in the row according to the column size
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = ((int) (Math.random() * 10));   //заполняем массив рандомно для быстроты и далее выводим на консоль для наглядности
                System.out.print(values[i][j]);
            }
            System.out.println();
        }
        HW1Utils.arrayOfEvenNumbersVar2(values);



//    2) метод принимает входящим параметром 5 чисел и печатает на консоль меньшее из них
        System.out.println();
        System.out.println("\nЗадание 2");

        int nums[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        HW1Utils.MinOfNumbers(nums);


//3) метод принимает входящим параметром одномерный массив чисел. Метод заполняет данный массив любыми числами рандомно, и возвращает заполненный массив
        System.out.println();
        System.out.println("\nЗадание 3");
        int arrayOfNumbers[] = new int[5];
        HW1Utils.fullRandomArray(arrayOfNumbers);


// 4) метод принимает входящим параметром цифру от 1 до 12, и возвращает слово - эквивалент месяца. Например, в метод передали 02 - метод вернул слово ФЕВРАЛЬ
        System.out.println();
        System.out.println("\nЗадание 4");
        System.out.println("Введите число от 1 до 12: ");
        int numOfMonth = scanner.nextInt();
        HW1Utils.naimOfMonth(numOfMonth);


        System.out.println();
        System.out.println("\nЗадание 4 вариант 2");
        HW1Utils.getNameOfMonth("Введите число от 1 до 12: ");

        System.out.println();
        System.out.println("\nЗадание 5");
        System.out.println("Введите первую сторону треугольника: ");
        int sideA = scanner.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int sideB = scanner.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int sideC = scanner.nextInt();
        HW1Utils.realTriangle(sideA, sideB, sideC);
    }
}



