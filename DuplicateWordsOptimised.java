class DuplicateWordsOptimised {
    public static void main(String[] args) {

        String str = "java is java and java is powerful";
        int n = str.length();

        String[] words = new String[20];
        boolean[] visited = new boolean[20];
        int index = 0;
        String temp = "";

        // String → words
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                temp = temp + ch;
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index++] = temp;

        // duplicate detection
        for (int i = 0; i < index; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < index; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(words[i]);
            }
        }
    }
}
