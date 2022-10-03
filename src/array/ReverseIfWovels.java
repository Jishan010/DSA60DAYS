package array;


import java.util.Arrays;

public class ReverseIfWovels {
    public static void main(String[] args) {

        String reversedValue = reverseVowels("This is my name");
        System.out.println(reversedValue);

        String reversedValue1 = reverseVowels("following");
        System.out.println(reversedValue1);
    }

    // This is my name -> This as my nime
    public static String reverseVowels(String elements) {
        int i = 0;
        int j = 1;

        char[] items = elements.toCharArray();

        while (j < items.length) {
            if (checkIfWowel(items[i]) && checkIfWowel(items[j])) {
                //logic for swap items
                char temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i = j;
                j++;
            } else if (checkIfWowel(items[i])) {
                j++;
            } else if (checkIfWowel(items[j])) {
                i = j;
                j = j + 1;
            } else {
                i++;
                j++;
            }
        }
        return Arrays.toString(items);
    }


    public static boolean checkIfWowel(char i) {
        return i == 'o' || i == 'i' || i == 'u' || i == 'a' || i == 'e';
    }
}
