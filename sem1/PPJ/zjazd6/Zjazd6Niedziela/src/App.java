public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Tree tree = new Tree(true, 10, "Green");
        System.out.println(tree);
        ConiferTree coniferTree = new ConiferTree(true, 100, "10", 100, 100);
        System.out.println(coniferTree);
        DeciduousTree deciduousTree = new DeciduousTree(true, 100, "10", 100);
        System.out.println(deciduousTree);
        FruitTree fruitTree = new FruitTree(true, 100, "10", 100, "Apple");
        System.out.println(fruitTree);
        // Tree[] forest = new Tree[6];
        // ConiferTree sosna = new ConiferTree(true, 100, "10", 100, 100);
        // forest[0] = sosna;
        // System.out.println(forest[0])
    }
}
