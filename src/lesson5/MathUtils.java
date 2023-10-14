package lesson5;

public class MathUtils {
    //площадь круга
    public static double areaOfCircle(int a) {
        return Math.PI * Math.pow(a, 2);
    }
    //периметр круга
    public static double perimeterOfCircle(int a){
        return Math.PI * (a * a);
    }
    //площадь овала
    public static double areaOfOval(int a, int b){
        return (Math.PI * a * b);
    }
    //периметр овала
    public static double perimeterOfOval(int a, int b){
        return (2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
    }
    //площадь прямоугольник
    public static double areaOfRectangle(int a, int b){
        return (a * b);
    }
    //периметр прямоугольника
    public static double perimeterOfRectangle(int a, int b){
        return (2 * (a + b));
    }
    //площадь треугольника
    public static double areaOfTriangle(int a, int b, int c){
        int p=(a + b + c)/2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }
    //периметр треугольника
    public static double perimeterOfTriangle(int a, int b, int c){
        return (a + b + c);
    }

    //площадь квадрата
    public static double areaOfSquare(int a){
        return Math.pow(a,2);
    }
    //периметр квадрата
    public static double perimeterOfSquare(int a){
        return 4*a;
    }
    //площадь трапеции
    public static double areaOfTrapezoid(int a, int b, int c){
        return((a + b)/2)*c;
    }
    //периметр трапеции
    public static double perimeterOfTrapezoid(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
