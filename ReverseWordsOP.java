

public class ReverseWordsOP {

    public static void main(String[] args) {
        String str = "I Love Programming";
        char[] ch = str.toCharArray();

        char[] result = new char[ch.length];
        int index = 0;

        int i = ch.length - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && ch[i] == ' ') {
                i--;
            }

            if (i < 0) break;

            int end = i;

            // Find start of word
            while (i >= 0 && ch[i] != ' ') {
                i--;
            }

            int start = i + 1;

            // Copy word into result array
            for (int j = start; j <= end; j++) {
                result[index++] = ch[j];
            }

            // Add space if more words exist
            if (i >= 0) {
                result[index++] = ' ';
            }
        }

        // Print result
        for (int k = 0; k < index; k++) {
            System.out.print(result[k]);
        }
    }
}
