package ua.lviv.iot.algo.part2;

public class TextProcessor {
    public TextProcessor() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getSplitSentences() {
        return splitSentences;
    }

    public void setSplitSentences(String[] splitSentences) {
        this.splitSentences = splitSentences;
    }

    private String text = "I just purchased a state-of-the-art, top-of-the-line computer for my home office!"
            + "You are doing an amazing job at work!"
            + "My ex-girlfriend's new boyfriend is a know-it-all!"
            + "The sunsets on this beach are breathtaking!"
            + "Congratulations on your graduation!";
    private static final String REG_EX = ".*\\S-\\S.*\\S-\\S.*\\S-\\S.*!$";
    private String[] splitSentences;

    public void printAndDeleteFromText() {
        splitSentences();

        removeSentencesMatchingRegex();

        for (String sentence : splitSentences) {
            text = text + sentence;
        }
        System.out.println(text);
    }

    private void splitSentences() {
        splitSentences = text.split("(?<=[.?!])");
    }

    protected void removeSentencesMatchingRegex() {
        for (int i = 0; i < splitSentences.length; i++) {
            splitSentences[i] = splitSentences[i].replaceAll(REG_EX, "");
        }
        text = "";
    }

    public static void main(String[] args) {
        TextProcessor obj = new TextProcessor();
        obj.printAndDeleteFromText();
    }
}
