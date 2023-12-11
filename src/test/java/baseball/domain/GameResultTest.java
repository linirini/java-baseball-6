package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameResultTest {

    @DisplayName("낫싱인지 판별한다.")
    @Test
    void determine_if_Nothing() {
        assertThat(new GameResult(0, 0).isNothing()).isTrue();
        assertThat(new GameResult(0, 1).isNothing()).isFalse();
    }

}
