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
        Balls balls = new Balls(ballsNumber);

        // then
        assertThat(balls).isNotNull();
    }

    @DisplayName("3개의 정수를 입력했을때, Balls 객체가 가진 숫자가 입력한 숫자와 동일한지 테스트")
    @Test
    void createBallsWithEqualNumber() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        // when
        Balls balls = new Balls(ballsNumber);

        // then
        assertThat(balls.getBallsNumber()).isEqualTo(ballsNumber);
    }

}
