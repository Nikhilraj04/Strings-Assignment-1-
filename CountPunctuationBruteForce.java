public class CountPunctuationBruteForce {

    public static void main(String[] args) {

        String str = "Hello!!! How are you?? I'm fine.";
        int count = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Checking punctuation manually
            if (ch == '!' || ch == '.' || ch == ',' || ch == '?' ||
                ch == ';' || ch == ':' || ch == '\'' || ch == '"' ||
                ch == '-' || ch == '(' || ch == ')' ||
                ch == '[' || ch == ']' || ch == '{' || ch == '}') {

                count++;
            }
        }

        System.out.println("Total punctuations = " + count);
    }
}
