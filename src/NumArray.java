import java.util.List;

public class NumArray {
    static int[] arrayFiller(List<String> list) {
        int[] nums = new int[list.size()];
        int i = 0;
        for (String a : list) {
            nums[i] = a.length();
            i++;
        }
        return nums;
    }
}
