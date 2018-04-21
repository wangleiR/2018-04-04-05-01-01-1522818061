package tw.core;

import org.junit.Test;
import tw.validator.InputValidator;

import static org.junit.Assert.assertEquals;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {

    public InputValidator inputValidator = new InputValidator();

    @Test
    public void should_get_right_with_correct_input() {
        //输入正确时输入时,输入验证通过
        String str = "1 2 3 4";
        assertEquals(inputValidator.validate(str),true);
    }

    @Test
    public void should_get_error_with_long_size_input() {
        //输入数字的个数不正确时,输入验证不通过
        String str = "1 2 3 4 5";
        assertEquals(inputValidator.validate(str),false);
    }

    @Test
    public void should_get_error_with_other_split_input() {
        //输入数字的分隔符不正确时,输入验证不通过
        String str = "1;2 3;4";
        assertEquals(inputValidator.validate(str),false);
    }

    @Test
    public void should_get_error_with_repeat_num_input() {
        //输入重复数字时,输入验证不通过
        String str = "1 2 2 4";
        assertEquals(inputValidator.validate(str),false);
    }
}
