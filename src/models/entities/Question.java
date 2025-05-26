package models.entities;

import java.util.List;

public interface Question {
    void setQuestionText(String questionText);
    String getQuestionText();
    List<Option> getOptions();
    Option getCorrectOption();
    void setCorrectOption(Option correctOption);
    Option getUserSelectedOption();
    void setUserSelectedOption(Option userSelectedOption);
    void safeAddOption(Option option);
}
