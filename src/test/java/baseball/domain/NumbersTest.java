package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumbersTest {

    @Test
    void numbers() {
        assertThatNoException().isThrownBy(() -> new Numbers(List.of(1, 4, 9)));
    }

    @DisplayName("중복된 숫자를 입력할 경우 예외를 던진다.")
    @Test
    void duplicated_numbers_exception() {
        assertThatThrownBy(() -> new Numbers(List.of(1, 1, 3))).isInstanceOf(
                IllegalArgumentException.class);
    }

    @DisplayName("3자리의 숫자가 아닌 경우 예외를 던진다.")
    @Test
    void invalid_numbers_length_exception() {
        assertThatThrownBy(() -> new Numbers(List.of(1, 2, 3, 4))).isInstanceOf(
                IllegalArgumentException.class);
    }

    @DisplayName("1부터 9사이의 숫자가 아닌 경우 예외를 던진다.")
    @Test
    void invalid_numbers_range_exception() {
        assertThatThrownBy(() -> new Numbers(List.of(0, 1, 2))).isInstanceOf(
                IllegalArgumentException.class);
    }

    @DisplayName("같은 숫자의 개수를 반환한다")
    @ParameterizedTest
    @CsvSource({"3,2,1,3", "9,4,1,1", "4,5,6,0"})
    void count_same_numbers(int number1, int number2, int number3, int count) {
        Numbers numbers = new Numbers(List.of(1, 2, 3));
        assertThat(numbers.countSameNumbers(
                new Numbers(List.of(number1, number2, number3)))).isEqualTo(count);
    }

    @DisplayName("같은 숫자이면서 같은 위치에 있는 숫자의 개수를 반환한다")
    @ParameterizedTest
    @CsvSource({"3,2,1,1", "1,2,9,2", "4,5,6,0"})
    void count_same_numbers_on_same_position() {
        Numbers numbers = new Numbers(List.of(1, 2, 3));
        assertThat(numbers.countSameNumberOnSamePosition(new Numbers(List.of(3, 2, 1)))).isEqualTo(
                1);
        assertThat(numbers.countSameNumberOnSamePosition(new Numbers(List.of(1, 2, 9)))).isEqualTo(
                2);
        assertThat(numbers.countSameNumberOnSamePosition(new Numbers(List.of(4, 5, 6)))).isEqualTo(
                0);
    }

}
