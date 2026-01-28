class LongestSubstringOptimised {
    public static void main(String[] args) {

        String str = "abcabcbb";
        int n = str.length();

        int[] freq = new int[256];
        int start = 0, maxLen = 0, startIndex = 0;

        for (int end = 0; end < n; end++) {

            char ch = str.charAt(end);
            freq[ch]++;

            // jab tak duplicate hai window shrink karo
            while (freq[ch] > 1) {
                freq[str.charAt(start)]--;
                start++;
            }

            int currLen = end - start + 1;

            if (currLen > maxLen) {
                maxLen = currLen;
                startIndex = start;
            }
        }

        // result print
        for (int i = startIndex; i < startIndex + maxLen; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
