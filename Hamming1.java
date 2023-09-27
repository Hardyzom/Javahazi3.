public class Hamming1 {

    public static int calculate(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("A két sztring hossza különbözik.");
        }

        int hammingDistance = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }

    public static void main(String[] args) {
        String s1 = "toned";
        String s2 = "roses";

        try {
            int distance = calculate(s1, s2);
            System.out.println("Hamming-távolság: " + distance);
        } catch (IllegalArgumentException e) {
            System.out.println("Hiba: " + e.getMessage());
        }
    }
}
