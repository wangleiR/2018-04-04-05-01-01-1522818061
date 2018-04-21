package tw.core;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {

    private Answer answer = new Answer();

    @Test
    public void should_get_right_with_correct_input() {
        String str = "4 7 1 6";
        Answer an = answer.createAnswer(str);
        assertEquals(an.toString(),str);
    }

    @Test
    public void should_get_number_with_index() {
        String str = "4 7 1 6";
        Answer an = answer.createAnswer(str);
        assertEquals(an.getIndexOfNum("1"),2);
    }

    @Test
    public void should_get_equal_with_record() {
        Answer an = answer.createAnswer("4 7 1 6");
        Answer in = Answer.createAnswer("5 6 1 0");
        int[] arr = new int[]{1,1};
        assertEquals(Arrays.toString(an.check(in).getValue()),Arrays.toString(arr));
    }

}