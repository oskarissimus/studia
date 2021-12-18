public class DeciduousTree extends Tree {
    int leavesShape;

    public DeciduousTree(boolean alwaysGreen, int height, String crossSection, int leavesShape) {
        super(alwaysGreen, height, crossSection);
        this.leavesShape = leavesShape;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", leavesShape=" + leavesShape;
    }

}
