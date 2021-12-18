public class FruitTree extends DeciduousTree {
    String fruitName;

    public FruitTree(boolean alwaysGreen, int height, String crossSection, int leavesShape, String fruitName) {
        super(alwaysGreen, height, crossSection, leavesShape);
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "FruitTree{" +
                "alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'' +
                ", leavesShape=" + leavesShape +
                ", fruitName='" + fruitName + '\'' +
                '}';
    }
}
