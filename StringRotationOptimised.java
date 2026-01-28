class StringRotationOptimised {
    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        int n = s1.length();

        // s1 + s1 manually
        char[] combined = new char[n * 2];

        for (int i = 0; i < n; i++) {
            combined[i] = s1.charAt(i);
            combined[i + n] = s1.charAt(i);
        }

        boolean isRotation = false;

        // manual substring search
        for (int i = 0; i <= combined.length - n; i++) {

            int j;
            for (j = 0; j < n; j++) {
                if (combined[i + j] != s2.charAt(j)) {
                    break;
                }
            }

            if (j == n) {
                isRotation = true;
                break;
            }
        }

        System.out.println(isRotation);
    }
}
