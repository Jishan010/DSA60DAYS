package array;

public class CheckIfPrime {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printAllPrimes(array);
    }


    public static void printAllPrimes(int[] n) {
        boolean isPrime = false;
        for (int i = 2; i < n.length; i++) {
            for (int j = 2; j < n[i]; j++) {
                if (n[i] % j == 0) {
                    isPrime = false;
                    break;
                } else
                    isPrime = true;
            }
            if (isPrime)
                System.out.println(n[i]);
        }

    }
}
