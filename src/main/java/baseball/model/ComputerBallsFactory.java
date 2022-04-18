package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputerBallsFactory {

    private static final int start = 1;
    private static final int end = 9;
    private static final int size = 3;

    private ComputerBallsFactory() {
    }

    public static Balls makeBalls() {
        Set<Integer> set = new HashSet<>();

        while (set.size() != size) {
            set.add(Randoms.pickNumberInRange(start, end));
        }

        List<Integer> ballsNumbers = new ArrayList<>(set);

        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < ballsNumbers.size(); i++) {
            balls.add(new Ball(i, ballsNumbers.get(i)));
        }

        return new Balls(balls);
    }

    public static Balls retryMakeBalls(boolean isEnd, int strike, Balls computerBalls) {
        if (!isEnd && strike == 3) {
            return makeBalls();
        }

        return computerBalls;
    }


}
