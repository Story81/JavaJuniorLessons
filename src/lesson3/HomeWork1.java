package lesson3;
//Есть массив цифр (задайте его сами). Вывести на консоль:
//1) Сколько в массиве четных цифр?
//2) Все числа с массива, которые больше 10, но меньше 25.
//3) Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трем.
//5) Вывести на консоль сумму значений всех ячеек

public class HomeWork1 {
    public static void main(String[] args) {
        int[] nums = {23, 5, 88, 455, 7, 8, 96, 10, 12, 3};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count = count + 1;
            }
        }
        //Задание 2
        System.out.printf("1. Четных цифр в массиве:  %d \n", count);
        System.out.print("2. Все числа массива, которые больше 10, но меньше 25:  ");
        for (int i = 0; i < nums.length; i++) {
            if (10 < nums[i] & nums[i] < 25) {
                System.out.print(nums[i] + " ");
            }
        }
        //Задание 3
        System.out.println("");
        System.out.print("3. Числа в обратном порядке (кратные трем выводятся два раза):  ");
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 3 == 0) {
                System.out.print(nums[i] + " " + nums[i] + " ");
            } else {
                System.out.print(nums[i] + " ");
            }
        }
     }
}
