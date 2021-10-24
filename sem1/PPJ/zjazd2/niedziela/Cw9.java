public class Cw9 {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner (System.in);
        int rok = in.nextInt();
        if ((rok%4 == 0 && rok%100 != 0 )||rok%400==0){
            System.out.println("rok jest przestepczy");
        } else {
            System.out.println("rok nie jest przestepczy");
        }
    }
}
