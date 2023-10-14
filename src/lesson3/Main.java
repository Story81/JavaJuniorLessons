package lesson3;

public class Main {
    public static void main(String[] args) {
        //есть массив чисел. нужно вывести на консоль все числа с этого массива
        int [] nums = {4, 6, 2, 6, 8, 5};
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
//        System.out.println(nums[4]);
//        System.out.println(nums[5]);
        for (int i= 0; i < nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
}
