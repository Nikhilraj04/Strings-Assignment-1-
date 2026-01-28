public class DuplicateWordsBruteForce {
    public static void main(String[] args) {

        String str = "java is easy and java is powerful";
        String[] words = str.split(" ");

        System.out.println("Duplicate words:");

        for (int i = 0; i < words.length; i++) {
            int count = 1;

            if (words[i].equals("visited"))
                continue;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "visited"; // mark as processed
                }
            }

            if (count > 1) {
                System.out.println(words[i]);
            }
        }
    }
}
