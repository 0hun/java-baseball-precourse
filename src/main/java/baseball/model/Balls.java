package baseball.model;

import java.util.List;

public class Balls {

    private final List<Integer> ballsNumber;

    public Balls(List<Integer> ballsNumber) {
        this.ballsNumber = ballsNumber;
    }

    public List<Integer> getBallsNumber() {
        return ballsNumber;
    }
}
