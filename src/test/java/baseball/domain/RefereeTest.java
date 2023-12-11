package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RefereeTest {

    private Referee referee;

    @BeforeEach
    void init() {
        referee = new Referee();
    }

    @DisplayName("컴퓨터 숫자와 사용자 숫자를 비교해서 게임 결과를 반환한다.")
    @Test
    void determine_game_result() {
        Numbers computerNumbers = new Numbers(List.of(1, 2, 3));
        Numbers playerNumbers = new Numbers(List.of(3, 2, 1));
        GameResult result = referee.determineGameResult(computerNumbers, playerNumbers);
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(2);
    }

}
