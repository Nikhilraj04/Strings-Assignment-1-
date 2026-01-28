class StringCompressionOptimised {
    public static void main(String[] args) {

        String str = "aabcccccaaa";
        int n = str.length();

        char[] result = new char[n * 2]; // safe size
        int index = 0;

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);
            int count = 1;

            while (i + 1 < n && ch == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // character store
            result[index++] = ch;

            // count ko character me convert (single digit assume)
            result[index++] = (char) (count + '0');
        }

        // final output
        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);
        }
    }
}
