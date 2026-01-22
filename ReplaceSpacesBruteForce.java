public class ReplaceSpacesBruteForce {
    public static void main(String[] args) {

        String str = "I love Java";
        char replaceChar = '-';

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result = result + replaceChar;
            } else {
                result = result + ch;
            }
        }

        System.out.println("Result: " + result);
    }
}
