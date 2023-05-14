package ua.lviv.iot.algo.part2;

public class TextProcessor {
    public TextProcessor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    private String text;
    private static final String threeHyphensInASentence = ".*\\S-\\S.*\\S-\\S.*\\S-\\S.*!$";
    private static final String sentenceSeparation = "(?<=[.?!])";
    private String[] splitSentences;
    StringBuffer string = new StringBuffer();

    public void printAndDeleteFromText() {
        splitSentences();

        removeSentencesMatchingRegex();

        for (String sentence : splitSentences) {
            string.append(sentence);
        }
        text = string.toString();
        System.out.println(text);
    }

    private void splitSentences() {
        splitSentences = text.split(sentenceSeparation);
    }

    protected void removeSentencesMatchingRegex() {
        for (int i = 0; i < splitSentences.length; i++) {
            splitSentences[i] = splitSentences[i].replaceAll(threeHyphensInASentence, "");
        }
    }
}
