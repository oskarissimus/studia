public class Program7 {
    public static void main(String[] args) {
        int N = 153;
        int rzedowosc = 0;
        int D = N;
        while (D!=0) {
            D/=10;
            rzedowosc+=1;
        }
        System.out.println(rzedowosc);
        int pow_sum = 0;
        D = N;

        while (D!=0) {
            int R = D % 10;
            D /= 10;
            pow_sum+=R^rzedowosc;
        }
        System.out.println(pow_sum);
    }
}
