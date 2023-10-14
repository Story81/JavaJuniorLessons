package lesson3;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] nums = {123, 47, 456, 789, 234567, 890, 4444, 4, 555};
        //for each - проход по массиву (сокращенная версия с начала в конец)
        // (что лежит в массиве и как назовем элемент массива : название массива)

        for ( int n : nums ) {

            //число преобразовываем в текст
            String numInText = n + "";  // если добавить пробел будет текст
            if (numInText.contains("4")) {
                System.out.println(numInText);
            };
        }
    }
}
