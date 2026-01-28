class LongestSubstringBrute {
    public static void main(String[] args) {

        String str = "abcabcbb";
        int n = str.length();

        int maxLen = 0;
        int startIndex = 0;

        // har index se substring check
        for (int i = 0; i < n; i++) {

            boolean[] visited = new boolean[256]; // ASCII tracking
            int len = 0;

            for (int j = i; j < n; j++) {

                char ch = str.charAt(j);

                if (visited[ch]) {
                    break; // repeat mila → stop
                }

                visited[ch] = true;
                len++;
            }

            if (len > maxLen) {
                maxLen = len;
                startIndex = i;
            }
        }

        // longest substring print
        for (int i = startIndex; i < startIndex + maxLen; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
