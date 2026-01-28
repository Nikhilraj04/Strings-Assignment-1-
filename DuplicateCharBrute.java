class DuplicateCharBrute {
    public static void main(String[] args) {

        String str = "programming";
        char[] arr = new char[str.length()];

        // string → char array (manually)
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        // brute force comparison
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '0') // already counted
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0'; // mark duplicate
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " = " + count);
            }
        }
    }
}
