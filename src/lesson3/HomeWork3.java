package lesson3;

//Есть массив цифр (задайте его сами). Вывести на консоль:
//5) Вывести на консоль сумму значений всех ячеек
//6) * Вывести на консоль разницу между суммой значений четных ячеек, и нечетных ячеек

public class HomeWork3 {
    public static void main(String[] args) {
        int[] nums = {23, 5, 88, 455, 7, 8, 96, 10, 12, 3};
//Задание 5
        int sum = 0;
        int sumEvenElements = 0;
        int sumOddElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
            }
            sum = sum + nums[i];
        }
        System.out.printf("5. Сумма всех значений элементов массива = %d \n", sum);
//Задание 6
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumEvenElements = sumEvenElements + nums[i];
            } else {
                sumOddElements = sumOddElements + nums[i];
            }
        }
        System.out.printf("6. Разница между суммами значений четных и значений нечетных ячеек = %d \n", Math.abs(sumEvenElements - sumOddElements));
        System.out.println("Сумма четных элементов = " + sumEvenElements);
        System.out.println("Сумма нечетных элементов = " + sumOddElements);
    }
}






