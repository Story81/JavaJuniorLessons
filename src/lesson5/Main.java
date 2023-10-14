package lesson5;

public class Main {

    public static void main(String[] args) {
        ScannerUtil.printFigurs();
        String figura = ScannerUtil.getInputFigure(); //рекурсионный вызов

        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int radius = ScannerUtil.getParametr("Введите радиус круга: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.printf("Площадь круга: %.2f", MathUtils.areaOfCircle(radius));
            } else {
                System.out.printf("Периметр круга: %.2f", MathUtils.perimeterOfCircle(radius));
            }

        } else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {
            String action = ScannerUtil.getAction();
            int majorAxisLenght = ScannerUtil.getParametr("Введите большую полуось овала: ");
            int minorAxisLenght = ScannerUtil.getParametr("Введите малую полуось овала: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.printf("Площадь овала: %.2f", MathUtils.areaOfOval(majorAxisLenght, minorAxisLenght));
            } else {
                System.out.printf("Периметр овала: %.2f", MathUtils.perimeterOfOval(majorAxisLenght, minorAxisLenght));
            }

        } else if (figura.equals("3") || figura.equalsIgnoreCase("прямоугольник")) {
            String action = ScannerUtil.getAction();
            int firstSide = ScannerUtil.getParametr("Введите первую сторону прямоугольника: ");
            int secondSide = ScannerUtil.getParametr("Введите вторую сторону прямоугольника: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь прямоугольника: " + MathUtils.areaOfRectangle(firstSide, secondSide));
            } else {
                System.out.println("Периметр прямоугольника: " + MathUtils.perimeterOfRectangle(firstSide, secondSide));
            }

        } else if (figura.equals("4") || figura.equalsIgnoreCase("треугольник")) {
            String action = ScannerUtil.getAction();
            int a = ScannerUtil.getParametr("Введите первую сторону треугольника: ");
            int b = ScannerUtil.getParametr("Введите вторую сторону треугольника: ");
            int c = ScannerUtil.getParametr("Введите третью сторону треугольника: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.printf("Площадь треугольника: %.2f", MathUtils.areaOfTriangle(a, b, c));
            } else {
                System.out.println("Периметр треугольника: " + MathUtils.perimeterOfTriangle(a, b, c));
            }

        } else if (figura.equals("5") || figura.equalsIgnoreCase("квадрат")) {
            String action = ScannerUtil.getAction();
            int a = ScannerUtil.getParametr("Введите сторону квадрата: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь квадрата: " + MathUtils.areaOfSquare(a));
            } else {
                System.out.println("Периметр квадрата: " + MathUtils.perimeterOfSquare(a));
            }

        } else if (figura.equals("6") || figura.equalsIgnoreCase("трапеция")) {
            String action = ScannerUtil.getAction();
            if (action.equalsIgnoreCase("площадь")) {
                int firstBase = ScannerUtil.getParametr("Введите 1-e основание трапеции: ");
                int secondBase = ScannerUtil.getParametr("Введите 2-e основание трапеции: ");
                int heightOfTrapezoid = ScannerUtil.getParametr("Введите высоту трапеции: ");
                System.out.println("Площадь трапеции: " + MathUtils.areaOfTrapezoid(firstBase, secondBase, heightOfTrapezoid));
            } else {
                int firstBase = ScannerUtil.getParametr("Введите 1-e основание трапеции: ");
                int secondBase = ScannerUtil.getParametr("Введите 2-e основание трапеции: ");
                int firstSide = ScannerUtil.getParametr("Введите 1-e боковую сторону трапеции: ");
                int secondSide = ScannerUtil.getParametr("Введите 2-e боковую сторону  трапеции: ");
                System.out.println("Периметр трапеции: " + MathUtils.perimeterOfTrapezoid(firstBase, secondBase, firstSide, secondSide));
            }
        }
    }
}
