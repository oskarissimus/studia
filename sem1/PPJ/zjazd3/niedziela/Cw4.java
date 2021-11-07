import java.util.Scanner;

public class Cw4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte[] x = new byte[10];
        int i = 0;
        do {
            x[i] = s.nextByte();
            x[i] = (byte) Math.abs((int) x[i]);
            i++;
        } while (x[i - 1] != 0 && i < 10);
        s.close();

        for (byte xd : x)
            System.out.print(xd + " ");
        System.out.println();
    }
}
