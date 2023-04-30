package ua.lviv.iot.algo.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextProcessorTest {
    private static final String expectedOutputText = "You are doing an amazing job at work!The sunsets on this beach are breathtaking!Congratulations on your graduation!";
    private TextProcessor textProcessor;

    @BeforeEach
    public void setUp(){
        textProcessor = new TextProcessor();
    }

    @Test
    public void test(){
        textProcessor.printAndDeleteFromText();
        Assertions.assertEquals(expectedOutputText,textProcessor.getText());
    }

}
