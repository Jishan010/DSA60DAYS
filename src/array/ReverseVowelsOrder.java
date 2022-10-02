package array;

public class ReverseVowelsOrder {

    public static void main(String[] args) {
        String output = reverseVowelsInOrder("following");
        System.out.println(output);
    }

    //following using two pointers
    public static String reverseVowelsInOrder(String inputValue) {
        char[] arr = inputValue.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (checkIfWowel(arr[i]) && checkIfWowel(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (checkIfWowel(arr[i])) {
                j--;
            } else if (checkIfWowel(arr[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }

    public static boolean checkIfWowel(char i) {
        if (i == 'o' || i == 'i' || i == 'u' || i == 'a' || i == 'e') {
            return true;
        }
        return false;
    }
}



