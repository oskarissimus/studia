public class Cw2 {
    public static void main(String[] args) {
        System.out.println("hello");
        int[][] x = calculateSquares(800, 600, 100);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        // int[][] ret = { { 1, 10 }, { 2, 20 }, { 3, 1337 } };
        int squaresInWidth = screenWidth / side;
        int squaresInHeight = screenHeight / side;
        int squaresNo = squaresInWidth * squaresInHeight;
        int[][] ret = new int[2][squaresNo];
        for (int i = 0; i < squaresInWidth; i++) {
            for (int j = 0; j < squaresInHeight; j++) {
                ret[0][i * squaresInHeight + j] = i * side;
                ret[1][i * squaresInHeight + j] = j * side;
            }

        }
        return ret;
    }
}
