package array;

//todo

/**
 * https://leetcode.com/problems/add-binary/solutions/
 */
public class AddBinary {

    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {

        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        char reminder = '0';

        char[] result = new char[first.length + 1];

        //1010
        //1011

        for (int i = first.length - 1; i >= 0; i--) {


            for (int j = second.length - 1; j >= 0; j--) {

                if (first[i] == '1' && second[j] == '1' && reminder == '0') {
                    result[i] = '0';
                    reminder = '1';
                }
                else  if (first[i] == '1' && second[j] == '1' && reminder == '1'){
                    result[i] = '1';
                    reminder= '1';
                }
                else if (first[i] == '0' && second[j] == '1' && reminder == '1'){
                    result[i] = '1';
                    reminder= '1';
                }


            }

        }


        return "";
    }


}
