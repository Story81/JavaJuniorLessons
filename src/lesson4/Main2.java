package lesson4;

public class Main2 {
    public static void main(String[] args) {
        //есть двухмерный массив нолей
        //нужно напечатать на консоль только его диагональ
        //а вместо остальных ячеек - пустота
        int[][] nums = new int[9][9];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(i==j){         //(i+j==nums.length-1) другая диагональ
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }
    }
}
