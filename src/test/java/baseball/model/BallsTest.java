package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallsTest {

    @DisplayName("3개의 정수를 입력했을때, Balls 객체를 생성하는지 테스트")
    @Test
    void createBalls() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        // when
        Balls balls = BallsFactory.makeBalls(ballsNumber);

        // then
        assertThat(balls).isNotNull();
    }

    @DisplayName("3개의 정수를 입력했을때, Balls 객체가 가진 Ball 객체 사이즈가 입력한 3개의 정수와 길이가 같은지 테스트")
    @Test
    void createBallsWithEqualNumber() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        // when
        Balls balls = BallsFactory.makeBalls(ballsNumber);

        // then
        assertThat(balls.getBalls().size()).isEqualTo(ballsNumber.size());
    }

    @DisplayName("Balls 객체 비교하여 결과가 1Strike인지 테스트")
    @Test
    void strikeTest() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> computerBallsNumber = new ArrayList<>(Arrays.asList(1, 4, 5));
        Balls balls = BallsFactory.makeBalls(ballsNumber);
        Balls computerBalls = BallsFactory.makeBalls(computerBallsNumber);

        // when
        BallResult ballResult = balls.match(computerBalls);

        // then
        assertThat(ballResult.getStrike()).isEqualTo(1);
    }

    @DisplayName("Balls 객체 비교하여 결과가 1ball, 1Strike인지 테스트")
    @Test
    void ballAndStrikeTest() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> computerBallsNumber = new ArrayList<>(Arrays.asList(1, 3, 5));
        Balls balls = BallsFactory.makeBalls(ballsNumber);
        Balls computerBalls = BallsFactory.makeBalls(computerBallsNumber);

        // when
        BallResult ballResult = balls.match(computerBalls);

        // then
        assertThat(ballResult.isNothing()).isFalse();
    }

    @DisplayName("Balls 객체 비교하여 결과가 1ball, 1Strike인지 테스트")
    @Test
    void nothingTest() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> computerBallsNumber = new ArrayList<>(Arrays.asList(4, 5, 6));
        Balls balls = BallsFactory.makeBalls(ballsNumber);
        Balls computerBalls = BallsFactory.makeBalls(computerBallsNumber);

        // when
        BallResult ballResult = balls.match(computerBalls);

        // then
        assertThat(ballResult.isNothing()).isTrue();
    }

}
