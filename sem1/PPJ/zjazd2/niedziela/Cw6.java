public class Cw6 {
    public static void main (String[] args) {
        int a=10, b=9;
        boolean result1 = ( ! ( a < b ) && ! ( a > b ) );
        //zaprzeczenie alternatywy jest koniunkją zaprzeczeń
        //boolean result2 = !(  (a<b)  ||  (a>b)  );
        //boolean result3 = ! (a !=b);
        boolean result4 = a == b;
        System.out.println( result1 );
        System.out.println( result4 );
    }

}
