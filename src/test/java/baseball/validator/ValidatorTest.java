package baseball.validator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @DisplayName("값을 입력했을 때, 성공하는 테스트")
    @Test
    void validateEmpty() {
        // given
        String value = "1234";

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateEmpty(value);
        });

        // then
        assertThat(thrown).isEqualTo(null);
    }

    @DisplayName("빈값을 입력했을 때, 에러가 발생하는지 테스트")
    @Test
    void validateEmptyWithError() {
        // given
        String value = "";

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateEmpty(value);
        });

        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력 길이 사이즈가 3인 경우, 성공하는 테스트")
    @Test
    void validateLength() {
        // given
        String value = "123";

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateLength(value);
        });

        // then
        assertThat(thrown).isEqualTo(null);
    }

    @DisplayName("입력 길이 사이즈가 3이 아닐 경우, 에러가 발생하는지 테스트")
    @Test
    void validateLengthWithError() {
        // given
        String value = "1234";

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateLength(value);
        });

        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력한 문자가 숫자일 경우, 성공하는 테스트")
    @Test
    void validateNumber() {
        // given
        String value = "123";

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateNumber(value);
        });

        // then
        assertThat(thrown).isEqualTo(null);
    }

    @DisplayName("입력한 문자가 숫자가 아닐 경우 경우, 에러가 발생하는지 테스트")
    @Test
    void validateNumberWithError() {
        // given
        String value = "12n";

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateNumber(value);
        });

        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("3자리의 숫자가 중복값이 없는지 테스트")
    @Test
    void validateEqualNumbers() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 3));

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateEqualNumbers(ballsNumber);
        });

        // then
        assertThat(thrown).isEqualTo(null);
    }

    @DisplayName("3자리의 숫자가 중복값이 있을 경우 에러가 발생하는지 테스트")
    @Test
    void validateEqualNumbersWithError() {
        // given
        List<Integer> ballsNumber = new ArrayList<>(Arrays.asList(1, 2, 2));

        // when
        Throwable thrown = catchThrowable(() -> {
            Validator.validateEqualNumbers(ballsNumber);
        });

        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }

}
