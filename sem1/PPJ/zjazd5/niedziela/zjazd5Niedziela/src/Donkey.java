public class Donkey {
    private double mass; // mass in kg
    private Baloon[] baloons;

    public Donkey(double mass) {
        this.mass = mass;
        System.out.println(String.format("tworzę osiołka o masie %,.2f Kg", this.mass));
    }

    public double getMassInGrams() {
        return this.mass * 1000;
    }

    public void addBaloon(Baloon b) {
        Baloon[] newBaloons;
        if (this.baloons == null) {
            newBaloons = new Baloon[1];
            newBaloons[0] = b;
        } else {
            newBaloons = new Baloon[this.baloons.length + 1];
            for (int i = 0; i < this.baloons.length; i++) {
                newBaloons[i] = this.baloons[i];
            }
            newBaloons[this.baloons.length] = b;
        }
        this.baloons = newBaloons;

    }

    public boolean isFlying() {
        double totalLift = 0;
        if (this.baloons == null)
            return false;

        for (int i = 0; i < this.baloons.length; i++) {
            totalLift += this.baloons[i].getLoad();
        }
        if (totalLift > this.getMassInGrams())
            return true;
        else
            return false;
    }
}