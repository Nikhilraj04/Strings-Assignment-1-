class FirstNonRepeatingOptimised {
    public static void main(String[] args) {

        String str = "swiss";
        int[] freq = new int[256]; // ASCII characters

        // 1️⃣ har character ka count
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // 2️⃣ pehla character jiska count 1 hai
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
