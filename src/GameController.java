package src;

public class GameController implements GameEvents{

    public void gameFinished() {
        System.exit(1);
    }
}