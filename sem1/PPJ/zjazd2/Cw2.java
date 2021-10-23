public class Cw2 {
    public static void main (String[] args) {
        char charValue = 'x';
        char charvalue = 'd';
        //skompiluje się ponieważ to są inne nazwy zmiennych - aczkolwiek wydaje się to złą praktyką
        System.out.println(charValue-charvalue);
    }
}