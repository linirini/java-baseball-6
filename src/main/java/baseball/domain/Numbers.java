package baseball.domain;

import java.util.List;

public class Numbers {

    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers){

    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int countSameNumbers(Numbers numbersToCompare){
        return -1;
    }

    public int countSameNumberOnSamePosition(Numbers numbersToCompare){
        return -1;
    }

}
