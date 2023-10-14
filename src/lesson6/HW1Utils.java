package lesson6;
//Создаем класс в котором прописываем методы:
//        1) метод принимает входящими параметрами двухмерный массив с числами. И возвращает из метода кол-во четных чисел в двухмерном массиве

import java.util.Random;
import java.util.Scanner;

public class HW1Utils {
    public static void arrayOfEvenNumbers(int[][] array) {
        System.out.println("Выводим четные числа массива: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    public static int arrayOfEvenNumbersVar2(int[][] array) {
        System.out.println("Выводим четные числа массива: ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
            }



    // 2) метод принимает входящим параметром 5 чисел и печатает на консоль меньшее из них
    // Если в принимаемом массиве не 5 чисел, выдается предупреждение
    public static void MinOfNumbers(int[] array) {
        if (array.length == 5) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Минимальное число: " + min);
        } else {
            System.out.println("Введите ровно 5 чисел");
        }
    }

//3) метод принимает входящим параметром одномерный массив чисел. Метод заполняет данный массив любыми числами рандомно, и возвращает заполненный массив

    public static void fullRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100); // добавила условие, что числа от -100 до 100
        }
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // выводим элементы массива на экран
        }
    }

    // 4) метод принимает входящим параметром цифру от 1 до 12, и возвращает слово - эквивалент месяца.
    public static void naimOfMonth(int a) {
        switch (a) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("Вы ввели число не в заданном диапазоне");
        }
    }


//    вариант 2 задания 4 (с проверкой на ввод не числа)

    public static String getNameOfMonth(String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        String input = scanner.next();
        if (isNumeric(input)) {
            // конвертация String to int
            // добавить проверку на минусовое значение
            //  return Integer.parseInt(input);
            int number = Integer.parseInt(input);
            if (number == 1) {
                System.out.println("январь");
            } else if (number == 2) {
                System.out.println("февраль");
            } else if (number == 3) {
                System.out.println("март");
            } else if (number == 4) {
                System.out.println("апрель");
            } else if (number == 5) {
                System.out.println("май");
            } else if (number == 6) {
                System.out.println("июнь");
            } else if (number == 7) {
                System.out.println("июль");
            } else if (number == 8) {
                System.out.println("август");
            } else if (number == 9) {
                System.out.println("сентябрь");
            } else if (number == 10) {
                System.out.println("октябрь");
            } else if (number == 11) {
                System.out.println("ноябрь");
            } else if (number == 12) {
                System.out.println("декабрь");
            } else {
                System.out.println("Вы ввели число вне заданного диапазона. ");
                return getNameOfMonth(messageToUser);
            }
        } else {
            System.out.println("Вы ввели не число! Повторите");
            return getNameOfMonth(messageToUser); //рекурсивный метод - метод вызывает себя столько раз, сколько нужно по каким то условиям
        }
        return input;
    }


    public static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


// 5) метод принимает 3 стороны треугольника. И пишет на консоль это реальный треугольник или нет.

    public static void realTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("реальный трегоульник");
            } else {
                System.out.println("НЕреальный трегоульник");
            }
        } else {
            System.out.println("значение стороны треугольника не может быть меньше или равно 0!");
        }
    }
}






