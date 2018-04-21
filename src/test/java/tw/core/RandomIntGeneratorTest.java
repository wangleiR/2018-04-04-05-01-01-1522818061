package tw.core;


import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {

    @Test
    public void should_get_right_with_correct_input() {
        //产生随机数
        RandomIntGenerator randomIntGenerator = mock(RandomIntGenerator.class);

        when(randomIntGenerator.generateNums(9,4)).thenReturn("4 7 1 6");
        assertEquals(randomIntGenerator.generateNums(9,4),"4 7 1 6");
    }

    @Test
    public void return_answer_in_fixed_num() {
        //产生指定个数的随机数
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        assertEquals(Arrays.stream(randomIntGenerator.generateNums(9,4).split(" "))
                .collect(Collectors.toList()).size() == 4 ? true : false , true);
    }
}