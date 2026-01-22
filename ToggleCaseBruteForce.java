public class ToggleCaseBruteForce {
    public static void main(String[] args) {

        String str = "JaVa ProGRam";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            } 
            else {
                result = result + ch;
            }
        }

        System.out.println("Result: " + result);
    }
}
