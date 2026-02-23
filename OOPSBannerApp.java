public class OOPSBannerApp {

    // Method to generate row for letter O
    static String generateO(int row) {
        String[] O = {
            "****",
            "*  *",
            "*  *",
            "****"
        };
        return O[row];
    }

    // Method to generate row for letter P
    static String generateP(int row) {
        String[] P = {
            "****",
            "*  *",
            "****",
            "*   "
        };
        return P[row];
    }

    // Method to generate row for letter S
    static String generateS(int row) {
        String[] S = {
            "****",
            "*   ",
            "   *",
            "****"
        };
        return S[row];
    }

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", generateO(0), generateO(0), generateP(0), generateS(0)),
            String.join(" ", generateO(1), generateO(1), generateP(1), generateS(1)),
            String.join(" ", generateO(2), generateO(2), generateP(2), generateS(2)),
            String.join(" ", generateO(3), generateO(3), generateP(3), generateS(3))
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}