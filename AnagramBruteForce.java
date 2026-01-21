public class AnagramBruteForce {

    public static void main(String[] args) {

        String s1 = "Listen";
        String s2 = "Silent";

        // Step 1: Length check
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Step 2: Convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        boolean isAnagram = true;
        boolean[] used = new boolean[s2.length()];

        // Step 3: Compare characters
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);
            boolean found = false;

            for (int j = 0; j < s2.length(); j++) {

                if (ch == s2.charAt(j) && !used[j]) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}
