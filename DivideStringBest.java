public class DivideStringBest {

    public static void main(String[] args) {

        String str = "abcdefgh";
        int n = 4;

        int len = str.length();

        if (len % n != 0) {
            System.out.println("String cannot be divided into equal parts");
            return;
        }

        int partSize = len / n;

        for (int i = 0; i < len; i += partSize) {

            for (int j = i; j < i + partSize; j++) {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }
    }
}
