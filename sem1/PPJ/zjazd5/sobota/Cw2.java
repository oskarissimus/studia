public class Cw2 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(154));
    }

    public static int[] splitToDigits(int number) {
        int digitsNo = 0;
        int num_left = number;
        while (num_left > 0) {
            digitsNo += 1;
            num_left /= 10;
        }
        int[] digits = new int[digitsNo];
        num_left = number;
        for (int i = digitsNo - 1; i >= 0; i--) {
            digits[i] = num_left % 10;
            num_left /= 10;
        }
        return digits;
    }

    public static boolean isArmstrongNumber(int n) {
        int[] n_digits = splitToDigits(n);
        int sum = 0;
        for (int i = 0; i < n_digits.length; i++) {
            sum += Math.pow(n_digits[i], n_digits.length);
        }
        return sum == n;
    }
}
