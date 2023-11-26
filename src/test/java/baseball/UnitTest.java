package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UnitTest {

    @Test
    @DisplayName("입력기능 단위테스트")
    public void 입력기능테스트() {

//        String input = readLine();
        System.out.println("1~9까지 숫자중 3개를 골라 적어주세요.");
        //given
        String input = "359";

        //then when
        Assertions.assertThat(input).isEqualTo("359");

    }
    int randomNumber = Randoms.pickNumberInRange(1, 9);

    @Test
    @DisplayName("입력기능 예외처리")
    public void 입력기능3이상의_입력_예외처리테스트() {
        System.out.println("1~9까지 숫자중 3개를 골라 적어주세요.");
        //given
        String input = "359";
        //then
        assertThatThrownBy(() -> input.charAt(4)).isInstanceOf(StringIndexOutOfBoundsException.class);
    }

    @Test
    @DisplayName("입력기능 예외처리")
    public void 숫자이외의입력_예외처리테스트() {
        System.out.println("1~9까지 숫자중 3개를 골라 적어주세요.");
        //given
        String input = "3,5,9";
        //then
        assertThatThrownBy(() -> Integer.parseInt(input)).isInstanceOf(NumberFormatException.class);
    }
}
