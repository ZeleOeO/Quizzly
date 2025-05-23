package models.entities;

import java.io.Serializable;
import java.util.List;

public class MultipleChoiceQuestion implements Question {
    private String questionText;
    private List<Option> options;

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
    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
