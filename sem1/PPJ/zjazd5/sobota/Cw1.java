public class Cw1 {
    public static void main(String[] args) {
        int[] x = splitToDigits(87695);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
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
}
