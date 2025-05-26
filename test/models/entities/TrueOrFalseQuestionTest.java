package models.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrueOrFalseQuestionTest {

    private TrueOrFalseQuestion question;
    private Option trueOption;
    private Option falseOption;

    @BeforeEach
    public void setUp() {
        question = new TrueOrFalseQuestion();
        trueOption = new Option("True");
        falseOption = new Option("False");
    }

    @Test
    public void testSetAndGetQuestionText() {
        question.setQuestionText("The earth is flat.");
        assertEquals("The earth is flat.", question.getQuestionText());
    }

    @Test
    public void testSafeAddOption() {
        question.safeAddOption(trueOption);
        question.safeAddOption(falseOption);
        List<Option> options = question.getOptions();
        assertTrue(options.contains(trueOption));
        assertTrue(options.contains(falseOption));
    }

    @Test
    public void testSetAndGetCorrectOption() {
        question.setCorrectOption(trueOption);
        assertEquals(trueOption, question.getCorrectOption());
    }

    @Test
    public void testSetAndGetUserSelectedOption() {
        question.setUserSelectedOption(falseOption);
        assertEquals(falseOption, question.getUserSelectedOption());
    }

    @Test
    public void testInitialOptionsSize() {
        // Should be initialized with 2 nulls due to Arrays.asList(new Option[2])
        List<Option> options = question.getOptions();
        assertEquals(2, options.size());
        assertNull(options.get(0));
        assertNull(options.get(1));
    }

    @Test
    public void testSafeAddOptionExceedsLimit() {
        question.safeAddOption(trueOption);
        question.safeAddOption(falseOption);
        question.safeAddOption(new Option("Stuff"));
        List<Option> options = question.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(trueOption));
        assertTrue(options.contains(falseOption));
    }
}
