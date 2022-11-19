package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void studyTest1() {
        /*
         *  요구사항 1
         *  "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
         *  "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
         */
        String inputStr1 = "1,2";
        String inputStr2 = "1";
        String[] splitStr1 = inputStr1.split(",");
        String[] splitStr2 = inputStr2.split(",");

        assertThat(splitStr1).contains("1", "2"); // 요구사항 1-1 확인
        assertThat(splitStr2).containsExactly("1"); // 요구사항 1-2 확인
    }
}
