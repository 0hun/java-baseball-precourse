package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {

    @DisplayName("정수와 위치를 입력했을때, 객체를 생성하는 테스트")
    @Test
    void createBall() {
        // given
        int position = 1;
        int number = 1;

        // when
        Ball ball = new Ball(position, number);

        // then
        assertThat(ball).isNotNull();
    }

    @DisplayName("정수와 위치를 입력했을때, 객체가 가진 숫자가 입력한 숫자와 동일한지 테스트")
    @Test
    void createBallWithEqualNumber() {
        // given
        int position = 1;
        int number = 1;

        Ball computerBall = new Ball(1, 1);

        // when
        Ball ball = new Ball(position, number);

        // then
        assertThat(ball).isEqualTo(computerBall);
    }

    @DisplayName("입력한 정수와 위치를 비교해서 스트라이크인지 확인하는 테스트")
    @Test
    void equalStrike() {
        // given
        int position = 1;
        int number = 1;

        Ball computerBall = new Ball(1, 1);

        // when
        Ball ball = new Ball(position, number);

        // then
        assertThat(computerBall.matchNumber(ball)).isEqualTo(BallStatus.STRIKE);
    }

    @DisplayName("입력한 정수와 위치를 비교해서 볼인지 확인하는 테스트")
    @Test
    void equalBall() {
        // given
        int position = 3;
        int number = 1;

        Ball computerBall = new Ball(1, 1);

        // when
        Ball ball = new Ball(position, number);

        // then
        assertThat(computerBall.matchNumber(ball)).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("입력한 정수와 위치를 비교해서 낫싱인지 확인하는 테스트")
    @Test
    void equalNothing() {
        // given
        int position = 3;
        int number = 2;

        Ball computerBall = new Ball(1, 1);

        // when
        Ball ball = new Ball(position, number);

        // then
        assertThat(computerBall.matchNumber(ball)).isEqualTo(BallStatus.NOTHING);
    }

}
