package lesson3;
//7) * Есть массив qwer (char[] qwer = {'q','w','e','r'};).
// И так же есть второй массив abcd (char[] abcd = {'a','b','c','d'};).
// Нужно создать третий массив, в который с помощью цикла for переложить все символы с первого массива, и со второго.
// По итогу получится третий массив, который будет являться соединенной копией первого и второго массива.

public class HomeWork4 {

    public static void main(String[] args) {
        char[] qwer = {'q', 'w', 'e', 'r'};
        char[] abcd = {'a', 'b', 'c', 'd'};
        int count1 = 0;  //счетчик для переноса первого массива


        String[] newArray = new String[qwer.length + abcd.length];

        for (int i = 0; i < qwer.length; i++) {
            String newChar = String.valueOf(qwer[i]);
            newArray[count1] = newChar;
            count1++;
        }

        for (int i = 0; i < qwer.length; i++) {
            String newChar = String.valueOf(abcd[i]);
            newArray[count1] = newChar;
            count1++;
        }

        for (int i = 0; i < count1; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}

