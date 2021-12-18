public class Tree {
    private boolean alwaysGreen;
    private int height;
    private String crossSection;

    public Tree(boolean alwaysGreen, int height, String crossSection) {
        this.alwaysGreen = alwaysGreen;
        this.height = height;
        this.crossSection = crossSection;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'';
    }
}
