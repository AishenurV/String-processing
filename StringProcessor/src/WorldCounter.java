public class WorldCounter {

    public static int calculateWords(String sentence) {
        String[] words = sentence.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        // Example usage
        String exampleSentence = "This is an example sentence.";
        int wordCount = calculateWords(exampleSentence);
        System.out.println("Number of words: " + wordCount);
    }
}

