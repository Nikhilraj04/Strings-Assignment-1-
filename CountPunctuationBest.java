public class CountPunctuationBest {

    public static void main(String[] args) {

        String str = "Hello!!! How are you?? I'm fine.";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // If NOT letter, NOT digit, NOT space → punctuation
            if (!((ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z') ||
                  (ch >= '0' && ch <= '9') ||
                  ch == ' ')) {

                count++;
            }
        }

        System.out.println("Total punctuations = " + count);
    }
}
