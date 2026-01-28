class StringRotationBrute {
    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        int n = s1.length();
        boolean isRotation = false;

        // n times rotate
        for (int i = 0; i < n; i++) {

            // left rotation manually
            char first = s1.charAt(0);
            String rotated = "";

            for (int j = 1; j < n; j++) {
                rotated = rotated + s1.charAt(j);
            }
            rotated = rotated + first;

            s1 = rotated;

            // compare strings manually
            int k;
            for (k = 0; k < n; k++) {
                if (s1.charAt(k) != s2.charAt(k)) {
                    break;
                }
            }

            if (k == n) {
                isRotation = true;
                break;
            }
        }

        System.out.println(isRotation);
    }
}
