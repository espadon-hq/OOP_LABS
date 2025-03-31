import java.util.regex.Matcher;
import java.util.regex.Pattern;
class StringProcessor {
    private final String inputText;
    private final int k;
    private final char symbol;
    public StringProcessor(String inputText, int k, char symbol) {
        this.inputText = inputText;
        this.k = k;
        this.symbol = symbol;
    }
    public String processString() {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(inputText);
        StringBuilder resultBuilder = new StringBuilder();
        int lastMatchEnd = 0;
        while (matcher.find()) {
            String word = matcher.group();
            resultBuilder.append(inputText, lastMatchEnd, matcher.start());
            if (k <= word.length()) {
                StringBuilder modifiedWord = new StringBuilder(word);
                modifiedWord.setCharAt(k - 1, symbol);
                resultBuilder.append(modifiedWord);
            } else {
                resultBuilder.append(word);
            }
            lastMatchEnd = matcher.end();
        }
        resultBuilder.append(inputText.substring(lastMatchEnd));
        return resultBuilder.toString();
    }
}