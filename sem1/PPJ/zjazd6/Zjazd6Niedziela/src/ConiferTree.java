public class ConiferTree extends Tree {
    int needleQuantity;
    double coneLength;

    public ConiferTree(boolean alwaysGreen, int height, String crossSection, int needleQuantity, double coneLength) {
        super(alwaysGreen, height, crossSection);
        this.needleQuantity = needleQuantity;
        this.coneLength = coneLength;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'' +
                ", needleQuantity=" + needleQuantity +
                ", coneLength=" + coneLength +
                '}';
    }

}
