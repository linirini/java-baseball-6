package baseball.domain;

import static baseball.util.ExceptionEnum.DUPLICATED_NUMBERS;
import static baseball.util.ExceptionEnum.INVALID_NUMBER_LENGTH;
import static baseball.util.ExceptionEnum.NOT_IN_RANGE;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private static final int SIZE = 3;
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;
    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        throwIfInvalidNumbersLength(numbers);
        throwIfDuplicatedNumbers(numbers);
        throwIfInvalidNumberRange(numbers);
    }

    private void throwIfInvalidNumberRange(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number < START_NUMBER || number > END_NUMBER) {
                throw new IllegalArgumentException(NOT_IN_RANGE.getMessage());
            }
        }
    }

    private void throwIfInvalidNumbersLength(List<Integer> numbers) {
        if (isInvalidNumberLength(numbers)) {
            throw new IllegalArgumentException(INVALID_NUMBER_LENGTH.getMessage());
        }
    }

    private boolean isInvalidNumberLength(List<Integer> numbers) {
        return numbers.size() != SIZE;
    }

    private void throwIfDuplicatedNumbers(List<Integer> numbers) {
        List<Integer> existingNumberCount = initExistingNumberCount();
        for (Integer number : numbers) {
            if (existingNumberCount.get(number) != 0) {
                throw new IllegalArgumentException(DUPLICATED_NUMBERS.getMessage());
            }
            existingNumberCount.set(number, existingNumberCount.get(number) + 1);
        }
    }

    private List<Integer> initExistingNumberCount() {
        List<Integer> existingNumberCount = new ArrayList<>();
        for (int i = 0; i <= END_NUMBER; i++) {
            existingNumberCount.add(0);
        }
        return existingNumberCount;
    }

    public int countSameNumbers(Numbers numbersToCompare) {
        int count = 0;
        for (Integer number : numbersToCompare.numbers) {
            if (numbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    public int countSameNumberOnSamePosition(Numbers numbersToCompare) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (numbers.get(i) == numbersToCompare.numbers.get(i)) {
                count++;
            }
        }
        return count;
    }

}
