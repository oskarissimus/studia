public class Cw7 {
    public static void main(String[] args) {
        int[] tab = { 1, 2, 3, 4, 1, 2, 3, 4 }; // wszystkie liczby maja pare
        // int[] tab = { 1, 2, 3, 4, 1, 2, 3, 4, 5 }; //jedna liczba bez pary
        for (int i = 0; i < tab.length; i++) {
            boolean jestDubel = false;
            for (int j = 0; j < tab.length; j++)
                if (tab[i] == tab[j] && i != j) {
                    jestDubel = true;
                    break;
                }
            if (!jestDubel) {
                System.out.println("znaleziono liczbe wystepujaca tylko raz w tablicy");
                return;
            }

        }
        System.out.println("kazda z liczb wystepuje przynajmniej dwa razy w tablicy");

    }
}
