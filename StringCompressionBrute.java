class StringCompressionBrute {
    public static void main(String[] args) {

        String str = "aabcccccaaa";
        int n = str.length();

        // loop poori string pe
        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);
            int count = 1;

            // same character ko count karo
            while (i + 1 < n && ch == str.charAt(i + 1)) {
                count++;
                i++; // duplicate skip
            }

            // character + count print
            System.out.print(ch);
            System.out.print(count);
        }
    }
}
