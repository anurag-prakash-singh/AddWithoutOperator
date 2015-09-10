/**
 * Created by anurags on 9/9/15.
 */
public class Solution {
    private static int addNumbers(int a, int b) {
        int sum = 0, carry = 0;

        do {
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        } while (carry != 0);

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addNumbers(4, 6));
        System.out.println(addNumbers(14, 16));
        System.out.println(addNumbers(-9, 16));
    }
}
