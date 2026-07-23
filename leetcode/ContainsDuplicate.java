import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                return true;
            }

            map.put(num, 1);

        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (containsDuplicate(nums))
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}
