class Baloon {
    public double volume;

    public Baloon() {
        this.volume = rand_vol(0.005, 0.009);
    }

    private double rand_vol(double min, double max) {
        return Math.random() * (max - min) + min;
    }

    public double getLoad() {
        return this.volume * 6 / 0.007;
    }
}