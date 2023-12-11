package baseball.domain;

import static baseball.util.ExceptionEnum.DUPLICATED_NUMBERS;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private static final int SIZE = 3;
    private static final int MAX_NUMBER = 9;
    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        throwIfInvalidNumbersLength(numbers);
        throwIfDuplicatedNumbers(numbers);
    }

    private void throwIfInvalidNumbersLength(List<Integer> numbers) {
        if (isInvalidNumberLength(numbers)) {
            throw new IllegalArgumentException();
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
        for (int i = 0; i <= MAX_NUMBER; i++) {
            existingNumberCount.add(0);
        }
        return existingNumberCount;
    }

    public List<Integer> getNumbers() {
        return numbers;
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
