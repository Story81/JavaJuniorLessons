package blackJack;

import java.util.ArrayList;

public class BlackJack {
    private ArrayList<Player> players = new ArrayList<>();

    //метод - добавить игрока в игру
    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(Koloda koloda) {
        for (Player p : players) {  // проходимся по всем игрокам (неважно есть ли там крупье)
            p.addCardToHand(koloda.getRandomCard());
        }
        for (Player p : players) {  // раздали по второй карте
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    // метод - раздает все нужные карты всем игрокам, пока они не скажут, что хватит
    public void dealAllNeedCards(Koloda koloda) {
        for (Player p : players) {
            while (p.needMoreCards()) { //!!! программа динамически подстраивается (какой тип объекта она взяла и вызывает метод у конкретного Объекта)
                // если p диллер, то берет метод needMoewCards берет из класса dealer
                p.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    public void printWinner() {
        /** 24 26 25 27 - победил крупье
         *  24 19 25 27 - победил у кого недобор
         *  21 21 21 27 - победили 3 человека
         *  18 18 25 12 - победили двое, у кого ближе к 21
         *  12 12 13 14 - победил 14, у кого ближе к 21
         */

        //добавить класс boolean игроку

        for(Player p: players){ // устанавливаем флаг false тем, кто не может претендовать на победу
            if (p.countBallInHand() > 21) {
                p.setCanWin(false);
            }
         }
        //если у всех перебор - выйграл крупье
        if (countPlayersWhoCanWin()==0) {
            for (Player p : players) {
                if (p instanceof Dealer) {
                    System.out.println("Победил крупье!!! Его карты: ");
                    p.openHand();
                    return;
                }
            }
        }

        // если в игре остался только 1 человек, а у остальных перебор
        if (countPlayersWhoCanWin() ==1) {
            for (Player p : players) {
                if (p.isCanWin()){
                    System.out.println("Выйграл " + p.getName() + "! Его карты: ");
                    p.openHand();
                    return;
                }
            }
        }

        // метод, который находит бал ближний к 18, до 21 очка
        int ballWinner = -1;
        for (Player p : players) {
            if (p.isCanWin() && p.countBallInHand()>ballWinner) {
                ballWinner = p.countBallInHand();
            }
        }
// узнали бал победителя и печатаеем тех игроков, ку кого такой бал
        for (Player p : players) {
            if (p.countBallInHand() == ballWinner) {
                System.out.println("Выйграл " + p.getName() + "! Его карты: ");
                p.openHand();
            }
         }
    }
// метод, просчет сколько игроков осталось в игре
    private int countPlayersWhoCanWin(){
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }





}
