package blackJack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda {

    private ArrayList <Card> koloda =new ArrayList<>();
// массив заменяем на коллекции
// коллекция - это безразмерный массив (всего более 15 видов) Напр, ArrayList
    public void prepared(){
        // Трефовые карты
//        koloda[0] = new Card("Двойка трефа", 2); - было с массивом
        koloda.add (new Card("Двойка трефа", 2));
        koloda.add (new Card("Тройка трефа", 3));
        koloda.add (new Card("Четверка трефа", 4));
        koloda.add (new Card("Пятерка трефа", 5));
        koloda.add (new Card("Шестерка трефа", 6));
        koloda.add (new Card("Семерка трефа", 7));
        koloda.add (new Card("Восьмерка трефа", 8));
        koloda.add (new Card("Девятка трефа", 9));
        koloda.add (new Card("Десятка трефа", 10));
        koloda.add (new Card("Валет трефа", 10));
        koloda.add (new Card("Дама трефа", 10));
        koloda.add (new Card("Король трефа", 10));
        koloda.add (new Card("Туз трефа", 11));

        // Бубновые карты
        koloda.add (new Card("Двойка буби", 2));
        koloda.add (new Card("Тройка буби", 3));
        koloda.add (new Card("Четверка буби", 4));
        koloda.add (new Card("Пятерка буби", 5));
        koloda.add (new Card("Шестерка буби", 6));
        koloda.add (new Card("Семерка буби", 7));
        koloda.add ( new Card("Восьмерка буби", 8));
        koloda.add (new Card("Девятка буби", 9));
        koloda.add (new Card("Десятка буби", 10));
        koloda.add (new Card("Валет буби", 10));
        koloda.add (new Card("Дама буби", 10));
        koloda.add (new Card("Король буби", 10));
        koloda.add (new Card("Туз буби", 11));

        // крести
        koloda.add (new Card("Двойка крести", 2));
        koloda.add (new Card("Тройка крести", 3));
        koloda.add (new Card("Четверка крести", 4));
        koloda.add (new Card("Пятерка крести", 5));
        koloda.add (new Card("Шестерка крести", 6));
        koloda.add (new Card("Семерка крести", 7));
        koloda.add (new Card("Восьмерка крести", 8));
        koloda.add (new Card("Девятка крести", 9));
        koloda.add (new Card("Десятка крести", 10));
        koloda.add (new Card("Валет крести", 10));
        koloda.add (new Card("Дама крести", 10));
        koloda.add (new Card("Король крести", 10));
        koloda.add (new Card("Туз крести", 11));

        // Червовые карты
        koloda.add (new Card("Двойка черви", 2));
        koloda.add (new Card("Тройка черви", 3));
        koloda.add (new Card("Четверка черви", 4));
        koloda.add (new Card("Пятерка черви", 5));
        koloda.add (new Card("Шестерка черви", 6));
        koloda.add (new Card("Семерка черви", 7));
        koloda.add (new Card("Восьмерка черви", 8));
        koloda.add (new Card("Девятка черви", 9));
        koloda.add (new Card("Десятка черви", 10));
        koloda.add (new Card("Валет черви", 10));
        koloda.add (new Card("Дама черви", 10));
        koloda.add (new Card("Король черви", 10));
        koloda.add (new Card("Туз черви", 11));
    }

    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return koloda.get(randomNum);
    }



}


