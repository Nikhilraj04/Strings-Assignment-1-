class OnlyDigitsOptimised {
    public static void main(String[] args) {

        String str = "123a5";
        int i = 0;

        while (i < str.length()) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                i++;
            } else {
                break; // non-digit mil gaya
            }
        }

        if (i == str.length()) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String does NOT contain only digits");
        }
    }
}
