public class DivideStringBruteForce {

    public static void main(String[] args) {

        String str = "abcdefgh";
        int n = 4;

        int len = str.length();

        // Step 1: Check division possible
        if (len % n != 0) {
            System.out.println("String cannot be divided into equal parts");
            return;
        }

        int partSize = len / n;
        int index = 0;

        // Step 2: Divide string
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < partSize; j++) {
                System.out.print(str.charAt(index));
                index++;
            }

            System.out.println();
        }
    }
}
