package array;

public class MaxNumberOfWords {

    public static void main(String[] args) {
        String[] words = {"please wait", "continue to fight", "continue to win"};
        System.out.println(maxNumberOfWords(words));
    }


    public static int maxNumberOfWords(String[] words) {
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            String[] subwords = words[i].split(" ");
            if (maxLength < subwords.length) {
                maxLength = subwords.length;
            }
        }
        return maxLength;
    }
}
