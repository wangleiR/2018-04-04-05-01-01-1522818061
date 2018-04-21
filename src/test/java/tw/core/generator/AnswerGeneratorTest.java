package tw.core.generator;

import org.junit.Test;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {

    @Test
    public void should_get_right_in_generateAnswer() throws Exception{

        RandomIntGenerator randomIntGenerator = mock(RandomIntGenerator.class);
        AnswerGenerator answerGenerator = new AnswerGenerator(randomIntGenerator);
        when(randomIntGenerator.generateNums(9,4)).thenReturn("4 7 1 6");
        assertEquals(answerGenerator.generate().toString(),"4 7 1 6");

    }

}

