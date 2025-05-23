package models.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrueOrFalseQuestion implements Question {

    private String questionText;
    private List<Option> options;

    public TrueOrFalseQuestion() {
        this.options = Arrays.asList(new Option[2]);
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
        return options;
    }

    @Override
    public void setOptions(List<Option> options) {
        this.options = options;
    }
}