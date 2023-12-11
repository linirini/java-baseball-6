package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @DisplayName("중복된 숫자를 입력할 경우 예외를 던진다.")
    @Test
    void duplicated_numbers_exception(){
        assertThatThrownBy(() ->new Numbers(List.of(1,1,3))).isInstanceOf(IllegalArgumentException.class);
    }


}
