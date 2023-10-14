package lesson3;
//Есть массив цифр (задайте его сами). Вывести на консоль:
//4) ***Только те числа, которые содержат в себе символ 4 (не для всех)

public class HomeWork2 {

    public static void main(String[] args) {

        int[] nums = {123, 456, 789, 234567, 890, 4444, 4, 555};
        String digit = "4";
        int count = 0;

        String[] wordsWithDigit = new String[nums.length]; //создаем пустой текстовый массив, чтобы сохранять слова, содержание заявленный символ digit

//Создаем переменную String, которая будет видна только в цикле for. Присваиваем ей значение i-того элемента массива nums
// Если переменная содержит символ digit (а именно, 4), то добавляем эту строку в массив wordsWithDigit. Место элемента определяем счетчиком count

        for (int i = 0; i < nums.length; i++) {
            String stringNumber = String.valueOf(nums[i]);
            if (stringNumber.contains(digit)) {
                wordsWithDigit[count] = stringNumber;
                count++;
            }
        }
        //Выводим строковый массив
        for (int i = 0; i < count; i++) {
            System.out.print(wordsWithDigit[i] + " ");
        }
    }
}
