public class Jam {
    private String taste;
    private double weight;

    public Jam(String taste, double weight) {
        this.taste = taste;
        this.weight = weight;
    }

    public Jam(double weight) {
        this("Noname", weight);
    }

    public Jam(String taste) {
        this(taste, 100);
    }
}
