public class Cw3 {
    public static void main(String[] args) {
        Donkey d = new Donkey(20);
        while (!d.isFlying()) {
            Baloon b = new Baloon();
            d.addBaloon(b);
        }
        System.out.println("Ja latam!!!");
    }
}
