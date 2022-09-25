package mathsfordsa.bitwiseoperators;

/**
 * For reference https://youtu.be/fzip9Aml6og?t=2957
 */
public class FindUnique {

    public static void main(String[] args) {

        int[] array = {2, 5, 6, 7, 7, 6, 5, 8, 8, 2, 4};
        System.out.println(ans(array));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
