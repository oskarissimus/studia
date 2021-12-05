public class Cw5 {
    public static void main(String[] args) {
        int tabLen = (int) (Math.random() * 100.0);
        System.out.println("all numers no: " + tabLen);
        byte[] tab = new byte[tabLen];

        for (int i = 0; i < tabLen; i++)
            tab[i] = (byte) (Math.random() * 5.0);

        int evenNumbersNo = 0;
        for (byte n : tab)
            if (n % 2 == 0)
                evenNumbersNo++;
        System.out.println("even numbers no: " + evenNumbersNo);

        // byte[] evenNumbersTab = new byte[evenNumbersNo];
        int oddNumbersNo = tabLen - evenNumbersNo;
        System.out.println("odd numbers no: " + oddNumbersNo);
        // byte[] oddNumbersTab = new byte[oddNumbersNo];

    }
}
