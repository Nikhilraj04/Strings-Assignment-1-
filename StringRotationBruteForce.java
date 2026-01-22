public class StringRotationBruteForce {
    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        boolean isRotation = false;

        if (s1.length() == s2.length()) {

            String temp = s1;

            for (int i = 0; i < s1.length(); i++) {
                temp = temp.substring(1) + temp.charAt(0);

                if (temp.equals(s2)) {
                    isRotation = true;
                    break;
                }
            }
        }

        if (isRotation) {
            System.out.println("String is a rotation");
        } else {
            System.out.println("String is NOT a rotation");
        }
    }
}
