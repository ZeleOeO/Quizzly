package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion implements Question {
    private String questionText;
    private List<Option> options;
    private Option correctOption;
    private Option selectedUserOption;

    public MultipleChoiceQuestion() {
       this.options = Arrays.asList(new Option[4]);
    }

    @Override
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public String getQuestionText() {
        return this.questionText;
    }

    @Override
    public List<Option> getOptions() {
        return this.options;
    }

    @Override
    public Option getCorrectOption() {
        return this.correctOption;
    }

    @Override
    public void setCorrectOption(Option correctOption) {
        this.correctOption = correctOption;
    }

    @Override
    public Option getUserSelectedOption() {
        return this.selectedUserOption;
    }

    @Override
    public void setUserSelectedOption(Option userSelectedOption) {
        this.selectedUserOption = userSelectedOption;
    }

    @Override
    public void safeAddOption(Option option) {
        this.options.add(option);
    }
}
