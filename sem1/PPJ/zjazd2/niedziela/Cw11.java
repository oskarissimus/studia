public class Cw11 {
    public static void main (String[] args) {

        java.util.Scanner in = new java.util.Scanner (System.in);
        int n = in.nextInt();


        for (int i = 1 ; i<=n ; i++) {
            
            for (int j = 1 ; j<=n ; j++) {
                System.out.println(i*j);
            }
        }
    }
}
