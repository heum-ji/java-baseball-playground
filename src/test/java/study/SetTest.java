package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void test1() {
        /*
         * 요구사항 1
         * Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.
         */
        System.out.println("Set 크기 : " + numbers.size());
    }
}
