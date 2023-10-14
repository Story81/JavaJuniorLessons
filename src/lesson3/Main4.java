package lesson3;

public class Main4 {
    public static void main(String[] args) {
        //есть 2 знаменателя
        //нужно определить общий знаменатель

        int znam1 = 11;
        int znam2 = 8;

        int biggest = znam1; //на biggest сохранит бОльшее значение
        if (znam2 > znam1) {
            biggest = znam2;
        }
        for (int i = biggest; i <= znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
