package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class BallsFactory {

    private BallsFactory() {
    }

    public static Balls makeBalls(List<Integer> ballsNumbers) {
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < ballsNumbers.size(); i++) {
            balls.add(new Ball(i, ballsNumbers.get(i)));
        }

        return new Balls(balls);
    }
}
