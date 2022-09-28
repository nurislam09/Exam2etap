import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(twoSum(List.of(0,3,11,5), 6));
    }
    public static List<Integer> twoSum(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(i);a.add(j);
                    return a;
                }
            }
        }
        return null;
    }
}

