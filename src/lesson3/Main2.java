package lesson3;

public class Main2 {
    public static void main(String[] args) {
        //создать массив длинной 10 ячеек и наполнить его
        //числами, кратными 3 от 30и до... пока не заполнится массив
        //Вывести массив на консоль

        int[] nums = new int[10];
        int value = 30;
        for(int i =0; i < nums.length; i++){
            nums[i] = value;
            value = value + 3;
            System.out.println(nums[i]);
        }
    }
}
