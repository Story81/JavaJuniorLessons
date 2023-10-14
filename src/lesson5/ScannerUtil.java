package lesson5;

import java.util.Scanner;

public class ScannerUtil {
    /**
     * 1 - модификатор доступа (4 типа: public, private, protected, _________)
     * (слово, определяющее видимость данного метода)
     * public - видимость внутри всего проекта
     * private - видимость внутри текущего класса
     * protected - видимость внутри текущего класса и его наследниках (его дочерних классах)
     * _________ - покетная видимость (внутри текущей папки)
     * <p>
     * 2 - static (пишется или нет)
     * Если static отсутствует - данный метод вызывается у определенного объекта.
     * если мы обращаемся к какому-то определенному объекту - то не пишем.
     * если не важно, кто выполнит метод  - то static. Метод общий, вызывается у названия класса.
     * <p>
     * 3 - возвращаемый типа (или слово void, если такого нет)
     * 4 - название метода с маленькой буквы
     * 5 - входящие параметры, в круглых скобках через запятую с указанием типа и названием
     * 6 - тело метода (то, что будет происходить при вызове данного метода)
     */
    public static String getLevel() {
        System.out.println("Выберите уровень ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");
        //формула создания любого ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();
        return level;
    }

    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printFigurs() {
        System.out.println("ВыБерите фигуру: ");
        System.out.println("1-  круг");
        System.out.println("2 - овал");
        System.out.println("3 - прямоугольник");
        System.out.println("4 - треугольник");
        System.out.println("5 - квадрат");
        System.out.println("6 - трапеция");
    }

    public static String getInputFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фигуру");
        String input = scanner.next();
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6")
                || input.equalsIgnoreCase("круг") || input.equalsIgnoreCase("овал") || input.equalsIgnoreCase("прямоугольник")
                || input.equalsIgnoreCase("треугольник") || input.equalsIgnoreCase("квадрат")
                || input.equalsIgnoreCase("трапеция")) {
            return input;
        } else {
            System.out.println("Неверный ввод, повторите");
            return getInputFigure(); //рекурсивный вызов метода - метод вызывает себя столько раз, сколько нужно по каким то определенным условиям
        }
    }

    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Площадь или периметр?");
        String input = scanner.next();
        if (input.equalsIgnoreCase("площадь") || input.equalsIgnoreCase("периметр")) {
            return input;
        } else {
            System.out.println("Неверный ввод, повторите");
            return getAction(); //рекурсивный метод - метод вызывает себя столько раз, сколько нужно по каким то условиям
        }
    }

    public static int getParametr(String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        String input = scanner.next();
        if (isNumeric(input)) {
            // конвертация String to int
            // добавить проверку на минусовое значение
            //  return Integer.parseInt(input);
            int number = Integer.parseInt(input);
            if (number > 0) {
                return number;
            } else if (number == 0) {
                System.out.println("C нулевым параметром - это не будет заявленной фигурой! Введите корректное значение");
                return getParametr(messageToUser);
            } else {
                System.out.println("Значение параметра не должно быть отрицательным");
                return getParametr(messageToUser);
            }
        } else {
            System.out.println("Вы ввели не число! Повторите");
            return getParametr(messageToUser); //рекурсивный метод - метод вызывает себя столько раз, сколько нужно по каким то условиям
        }
    }

    public static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

