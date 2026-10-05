public class StringSplitExample {
    public static void main(String[] args) {
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
