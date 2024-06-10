package src.gamedie;

import java.util.Random;

public class RandomDie implements GameDie {

    @Override
    public Integer roll() {
        return new Random().nextInt(6) + 1;
    }
}
