public class MaxMinCharBruteForce {
    public static void main(String[] args) {

        String str = "success";
        int length = str.length();

        char maxChar = str.charAt(0);
        char minChar = str.charAt(0);
        int maxCount = 0;
        int minCount = length;

        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);
            int count = 0;

            for (int j = 0; j < length; j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = current;
            }

            if (count < minCount) {
                minCount = count;
                minChar = current;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);
    }
}
