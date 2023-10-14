package lesson12;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


            // проход по коллекции
            // 1- с помощью for - используется только в коллекциях, где есть индексы. По сетам не пройдем
            // 2- с помощью for each - можно пройтись по коллекциям, но НЕ ИЗМЕНИТЬ ЕЁ (заменить, удалить)
            // 3- с помощью итератора - можем пройтись по коллекции и модернизировать её

            //с помощью итератора

            TreeSet<Integer> text = new TreeSet<>(new ReversNumsComporator());
            text.add(5);
            text.add(4);
            text.add(6);
            text.add(2);
            text.add(2);
            text.add(1);
            text.add(8);
//            for (Iterator<Integer> iterator = text.iterator(); iterator.hasNext();) {
//                System.out.println(iterator.next());
//            }
        System.out.println(text);

    }
}
