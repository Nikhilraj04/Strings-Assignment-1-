public class ReplaceSpacesOptimized {
    public static void main(String[] args) {

        String str = "I love Java";
        char replaceChar = '-';

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                sb.append(replaceChar);
            } else {
                sb.append(ch);
            }
        }

        System.out.println("Result: " + sb.toString());
    }
}
