public class SubsetsBruteForce {
    public static void main(String[] args) {

        String str = "FUN";
        int n = str.length();

        for (int i = 0; i < n; i++) {           // start index
            for (int j = i; j < n; j++) {       // end index
                System.out.println(str.substring(i, j + 1));
            }
        }
    }
}
