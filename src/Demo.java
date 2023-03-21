import java.util.*;

public class Demo {
    public static void main(String[] args) {


        //ex 16
        String[] words = {"Davit", "Tigran", "Onik", "Hayk", "Jivan", "Nubar"};
        System.out.println(StringWords.findLongest(words));


        //ex17
        Map<String, Integer> map = new HashMap<>();
        map.put("Davit", 41);
        map.put("Tigran", 61);
        map.put("Onik", 71);
        map.put("Hayk", 21);
        map.put("Jivan", 65);
        map.put("Nubar", 50);
        map.put("Aren", 55);
        map.put("Hakob", 41);

        Set<String> keys = KeyFiller.keySeparator(map);

        System.out.println(keys);

        //ex18
        List<String> names = List.of(words);
        int[] arr = NumArray.arrayFiller(names);

        System.out.println(Arrays.toString(arr));







    }
}
