package lotto.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }

        Set<Integer> expectedNumbers = new HashSet<>(numbers);
        if(expectedNumbers.size() != numbers.size()) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
}
