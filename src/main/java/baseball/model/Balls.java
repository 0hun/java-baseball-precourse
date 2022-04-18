package baseball.model;

import java.util.List;
import java.util.Objects;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public BallResult match(Balls userBalls) {
        BallResult ballResult = new BallResult();

        for (Ball ball : balls) {
            userBalls.countBallStatus(ball, ballResult);
        }

        return ballResult;
    }

    public void countBallStatus(Ball computerBall, BallResult ballResult) {
        for (Ball userBall : this.getBalls()) {
            BallStatus status = userBall.matchNumber(computerBall);
            ballResult.record(status);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Balls balls1 = (Balls) o;
        return Objects.equals(balls, balls1.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}
