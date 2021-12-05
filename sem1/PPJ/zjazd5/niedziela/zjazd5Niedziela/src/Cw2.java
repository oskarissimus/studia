public class Cw2 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Bananas");
        fruit.show();
    }
}

class Fruit {
    public String name;
    public double weight;

    public Fruit(String name) {
        this.name = name;
        double min = 0.5;
        double max = 0.8;
        this.weight = rand_mass(min, max);
    }

    private double rand_mass(double min, double max) {
        return Math.random() * (max - min) + min;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.weight);
    }
}