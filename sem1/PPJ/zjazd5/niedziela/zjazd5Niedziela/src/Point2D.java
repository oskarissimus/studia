public class Point2D {
    public int x;
    public int y;

    public int[] get() {
        int[] ret = { this.x, this.y, 1 };
        return ret;
    }

    public void set(int[] val) {
        this.x = val[0];
        this.y = val[1];
    }
}
