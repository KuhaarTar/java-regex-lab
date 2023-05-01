package ua.lviv.iot.algo.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TextProcessorTest {
    private final String text = "I just purchased a state-of-the-art, top-of-the-line computer for my home office!"
            + "You are doing an amazing job at work!"
            + " My ex-girlfriend's new boyfriend is a know-it-all!"
            + " The sunsets on this beach are breathtaking!"
            + " Congratulations on your graduation!";
    private static final String expectedOutputText = "You are doing an amazing job at work! The sunsets on this beach are breathtaking! Congratulations on your graduation!";
    private TextProcessor textProcessor;

    @BeforeEach
    public void setUp(){
        textProcessor = new TextProcessor(text);
    }

    @Test
    public void test(){
        textProcessor.printAndDeleteFromText();
        Assertions.assertEquals(expectedOutputText,textProcessor.getText());
    }

}
