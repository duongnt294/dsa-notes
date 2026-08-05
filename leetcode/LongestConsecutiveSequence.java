import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        int n = sc.nextInt();

        // Nhập mảng
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        // Đưa tất cả phần tử vào HashSet
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Duyệt từng số trong HashSet
        for (int num : set) {

            // Nếu num là đầu dãy
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Đếm các số liên tiếp phía sau
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                // Cập nhật kết quả lớn nhất
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        System.out.println(maxLength);

        sc.close();
    }
}
