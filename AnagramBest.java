public class AnagramBest {

    public static void main(String[] args) {

        String s1 = "Listen";
        String s2 = "Silent";

        // Step 1: Length check
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] freq = new int[26];

        // Step 2: Count characters
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        // Step 3: Check frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
