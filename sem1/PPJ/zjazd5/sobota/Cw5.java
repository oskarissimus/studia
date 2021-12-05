public class Cw5 {
    public static void main(String[] args) {
        char[] s = { 'k', 'a', 'j', 'a', 'k' };
        System.out.println(isPalindrom(s));
    }

    public static boolean isPalindrom(char[] s) {
        if (s.length == 1) {
            return true;
        } else if (s.length == 2) {
            if (s[0] == s[1])
                return true;
            else
                return false;
        } else {
            if (s[0] == s[s.length - 1]) {
                char[] trimmed = new char[s.length - 2];
                for (int i = 1; i < s.length - 1; i++) {
                    trimmed[i - 1] = s[i];
                }
                return isPalindrom(trimmed);
            } else
                return false;

        }
    }
}
