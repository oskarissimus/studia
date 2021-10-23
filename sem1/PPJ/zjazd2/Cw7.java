public class Main {
    public static void main (String[] args) {
        for (int i=0 ; i < 2*2*2*2*2 ; i++) {
            String n_bin_str = String.format("%5s", Integer.toBinaryString(i)).replace(' ', '0');
            System.out.println(n_bin_str);
        }
    }
}