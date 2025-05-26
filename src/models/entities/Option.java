package models.entities;

public class Option {
    private String optionText;
    public Option(String optionText) {
        this.optionText = optionText;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}
