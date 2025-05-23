package models.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrueOrFalseQuestionTest {

    private TrueOrFalseQuestion question;
    private Option trueOption;
    private Option falseOption;

    @BeforeEach
    void setUp() {
        question = new TrueOrFalseQuestion();
        trueOption = new Option("True");
        falseOption = new Option("False");

        List<Option> options = Arrays.asList(trueOption, falseOption);
        question.setOptions(options);
    }

    @Test
    void testSetAndGetQuestionText() {
        question.setQuestionText("Is the sky blue?");
        assertEquals("Is the sky blue?", question.getQuestionText());
    }

    @Test
    void testSetAndGetOptions() {
        List<Option> options = question.getOptions();
        assertEquals(2, options.size());
        assertEquals("True", options.get(0).getOptionText());
        assertEquals("False", options.get(1).getOptionText());
    }

    @Test
    void testSetAndGetCorrectOption() {
        question.setCorrectOption(trueOption);
        assertEquals(trueOption, question.getCorrectOption());
    }

    @Test
    void testSetAndGetUserSelectedOption() {
        question.setUserSelectedOption(falseOption);
        assertEquals(falseOption, question.getUserSelectedOption());
    }

    @Test
    void testOptionArrayLimit() {
        question.getOptions().add(new Option("True"));
    }
}
