class DuplicateCharOptimised {
    public static void main(String[] args) {

        String str = "programming";
        int[] freq = new int[256]; // ASCII characters

        // har character ka count
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // duplicates print
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > 1) {
                System.out.println(ch + " = " + freq[ch]);
                freq[ch] = 0; // dobara print na ho
            }
        }
    }
}
