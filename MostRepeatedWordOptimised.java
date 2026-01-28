class MostRepeatedWordOptimised {
    public static void main(String[] args) {

        String text = "java is java and java is powerful";
        int n = text.length();

        String[] words = new String[20];
        boolean[] visited = new boolean[20];
        int index = 0;
        String temp = "";

        // text → words
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                temp = temp + ch;
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index++] = temp;

        String maxWord = "";
        int maxCount = 0;

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

            if (count > maxCount) {
                maxCount = count;
                maxWord = words[i];
            }
        }

        System.out.println("Most repeated word: " + maxWord);
    }
}
