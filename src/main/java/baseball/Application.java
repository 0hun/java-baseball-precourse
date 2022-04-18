package baseball;

import baseball.controller.BallGame;

public class Application {
    public static void main(String[] args) {
        BallGame ballGame = new BallGame();
        ballGame.play();
    }
}
