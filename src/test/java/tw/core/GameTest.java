package tw.core;

import org.junit.Test;
import tw.core.generator.AnswerGenerator;
import tw.core.generator.RandomIntGenerator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {

    @Test
    public void should_get_right_with_input() throws Exception{
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(Answer.createAnswer("4 7 1 6"));
        Game game = new Game(answerGenerator);
        Answer in = Answer.createAnswer("4 7 0 9");
        assertEquals(game.guess(in).getInputAnswer().toString(),"4 7 0 9");
        assertEquals(game.guess(in).getResult().toString(),"2A0B");
    }

}
