package baseball;

import baseball.view.InputView;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> ballNumbers = InputView.inputBallsNumber();
    }
}
