public class Cw3 {
    public static void main (String[] args) {
        boolean boolean1, boolean2;

        boolean1 = true;
        boolean2 = true;
        System.out.println((boolean1&& !boolean2)  ||  (boolean2&& !boolean1));

        boolean1 = true;
        boolean2 = false;
        System.out.println((boolean1&& !boolean2)  ||  (boolean2&& !boolean1));

        boolean1 = false;
        boolean2 = true;
        System.out.println((boolean1&& !boolean2)  ||  (boolean2&& !boolean1));

        boolean1 = false;
        boolean2 = false;
        System.out.println((boolean1&& !boolean2)  ||  (boolean2&& !boolean1));

    }
}