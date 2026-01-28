class OnlyDigitsBrute {
    public static void main(String[] args) {

        String str = "12345";
        boolean isDigit = true;

        // har character ko check kar rahe hain
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // agar character 0 se 9 ke beech nahi hai
            if (ch < '0' || ch > '9') {
                isDigit = false;
                break; // ek bhi galat mila to aage check ki zarurat nahi
            }
        }

        if (isDigit) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String does NOT contain only digits");
        }
    }
}
