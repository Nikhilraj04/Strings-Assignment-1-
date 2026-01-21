public class CountVowelsBest {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Convert to lowercase manually (ASCII)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total vowels = " + count);
    }
}
