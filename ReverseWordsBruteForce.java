

public class ReverseWordsBruteForce {

    public static void main(String[] args) {
        String str = "I Love Programming";
        String result = "";

        int i = str.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            // Store end index of word
            int end = i;

            // Move till start of the word
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

            int start = i + 1;

            // Append characters of the word
            for (int j = start; j <= end; j++) {
                result = result + str.charAt(j);
            }

            // Add space after each word
            result = result + " ";
        }

        System.out.println(result.trim());
    }
}
