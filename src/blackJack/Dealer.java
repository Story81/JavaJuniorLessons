package blackJack;

public class Dealer extends Player { //класс диллер имеет родотельский класс плейер, наследование.


    @Override
    public boolean needMoreCards() {
        if (countBallInHand() < 18) {
            return true;
        }
        return false;
    }
}
