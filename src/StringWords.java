public class StringWords {
    public static String findLongest(String[] words) {

        String longest = words[0];

        for (String s : words) {
            if (longest.length() < s.length()) {
                longest = s;
            }
        }

        return longest;
    }
}
