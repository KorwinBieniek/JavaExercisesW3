package pl.korwinbieniek.Ex161to170;

public class Ex169 {
    public String reverseWordsInSentence(String x)
    {
        StringBuilder sb = new StringBuilder();
        String[] words = x.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString();
    }
}
