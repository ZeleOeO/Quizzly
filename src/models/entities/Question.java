package models.entities;

import java.util.List;

public interface Question {
    void setQuestionText(String questionText);
    String getQuestionText();
    List<Option> getOptions();
    void setOptions(List<Option> options);
}
