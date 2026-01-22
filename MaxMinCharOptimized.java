public class MaxMinCharOptimized {
    public static void main(String[] args) {

        String str = "success";

        int[] freq = new int[256];

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = 0;
        char minChar = 0;
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        // Step 2: Find max & min occurring character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
            }

            if (freq[ch] < minCount) {
                minCount = freq[ch];
                minChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);
    }
}
