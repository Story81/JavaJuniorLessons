package lesson3;

public class Main1 {
    public static void main(String[] args) {
        //есть массив чисел. Нужно напечатать только четные числа в массиве и в обратном порядке.
        int[] nums = {23, 5, 88, 455, 7, 8, 96};
        //проход с конца 6 5 4 3 2 1 0
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]+ " ");
            }
        }
    }
}
