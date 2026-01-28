class FirstNonRepeatingBrute {
    public static void main(String[] args) {

        String str = "swiss";
        int n = str.length();

        // outer loop har character ke liye
        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);
            int count = 0;

            // inner loop compare ke liye
            for (int j = 0; j < n; j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            // agar count sirf 1 hai → non-repeating
            if (count == 1) {
                System.out.println("First non-repeating character: " + ch);
                break; // pehla mil gaya, aage check nahi
            }
        }
    }
}
